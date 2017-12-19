package com.example.b10705.newproject;

public class Myitems {
    private int img;
    private String name;
    private String cost;
    private String star;

    public Myitems(int img, String name, String cost, String star) {
        this.img = img;
        this.name = name;
        this.cost = cost;
        this.star = star;
    }

    public int getImg() {
        return img;
    }
    public String getName() {
        return name;
    }
    public String getCost() {
        return cost;
    }
    public String getStar() { return star; }
}
