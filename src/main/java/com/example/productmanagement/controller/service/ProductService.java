package com.example.productmanagement.controller.service;

import com.example.productmanagement.controller.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductService implements IProductService{
    private static final Map<Integer, Product> products;
    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"TiVi","120000","New","SamSung"));
        products.put(2,new Product(2,"TiVi","120000","New","SamSung"));
        products.put(3,new Product(3,"TiVi","120000","New","SamSung"));
        products.put(4,new Product(4,"TiVi","120000","New","SamSung"));
        products.put(5,new Product(5,"TiVi","120000","New","SamSung"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
      products.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
      products.put(id,product);
    }

    @Override
    public void remove(int id) {
    products.remove(id);
    }
}
