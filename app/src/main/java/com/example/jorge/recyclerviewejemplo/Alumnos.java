package com.example.jorge.recyclerviewejemplo;

/**
 * Created by Jorge on 25/02/2018.
 */

public class Alumnos {

    private int id;
    private String title;
    private String shortdesc;
    private String price;
    private int image;

    public Alumnos(int id, String title, String shortdesc, String price, int image){
        this.id = id;
        this.title = title;
        this.shortdesc = shortdesc;
        this.price = price;
        this.image = image;
    }
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getShortdesc() {
        return shortdesc;
    }
    public String getPrice(){
        return price;
    }


    public int getImage() {
        return image;
    }
}
