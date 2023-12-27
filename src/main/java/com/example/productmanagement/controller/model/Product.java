package com.example.productmanagement.controller.model;

public class Product {
    private int id;
    private String name;
    private String prize;
    private String tile;
    private String houseCreate;
    public Product(){}

    public Product(int id, String name, String prize, String tile, String houseCreate) {
        this.id = id;
        this.name = name;
        this.prize = prize;
        this.tile = tile;
        this.houseCreate = houseCreate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        this.prize = prize;
    }

    public String getTile() {
        return tile;
    }

    public void setTile(String tile) {
        this.tile = tile;
    }

    public String getHouseCreate() {
        return houseCreate;
    }

    public void setHouseCreate(String houseCreate) {
        this.houseCreate = houseCreate;
    }
}
