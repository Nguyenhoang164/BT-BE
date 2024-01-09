package com.example.musicmanagament.Service;

import com.example.musicmanagament.Model.Music;
import com.example.musicmanagament.Model.MusicForm;
import org.hibernate.HibernateError;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Service
public class HibernateMusicService implements IMusicService {
    private static SessionFactory sessionFactory;
    private static EntityManager entityManager;
    static {
        try {
            sessionFactory = new Configuration()
                    .configure("hibernate.conf.xml")
                    .buildSessionFactory();
            entityManager = sessionFactory.createEntityManager();
        }catch (HibernateError e){
            e.printStackTrace();
        }
    }
    @Override
    public List<Music> findAll() {
        String query = "SELECT c FROM Music AS c";
        TypedQuery<Music> querySelect = entityManager.createQuery(query,Music.class);
        return querySelect.getResultList();
    }

    @Override
    public void save(Music music) {
        Transaction transaction = null;
        Music origin;
        if (music.getId() == 0){
            origin = new Music();
        }else {
            origin = findById(music.getId());
        }
        try (Session session = sessionFactory.openSession()) {
            transaction = session.beginTransaction();
            origin.setNameSong(music.getNameSong());
            origin.setAuthor(music.getAuthor());
            origin.setKindMusic(music.getKindMusic());
            origin.setMultipartFile(music.getMultipartFile());
            session.saveOrUpdate(origin);
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
            if (transaction != null){
                transaction.rollback();
            }
        }
    }

    @Override
    public Music findById(int id) {
        String queryStr = "SELECT c FROM Music AS c WHERE c.id = :id";
        TypedQuery<Music> querySelect = entityManager.createQuery(queryStr,Music.class);
        querySelect.setParameter("id",id);
        return querySelect.getSingleResult();
    }

    @Override
    public void remove(int id) {
        Music music = findById(id);
        if (music != null){
            Transaction transaction = null;
            try (Session session = sessionFactory.openSession()){
                transaction = session.beginTransaction();
                session.remove(music);
                transaction.commit();
            }catch (Exception e){
                e.printStackTrace();
                if (transaction != null){
                    transaction.rollback();
                }
            }
        }
    }
}
