package com.example.mad_project2.models;

public class HomeCategory {
    String name;
    String ing_url;
    String type;

    public HomeCategory() {
    }

    public HomeCategory(String name, String ing_url, String type) {
        this.name = name;
        this.ing_url = ing_url;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIng_url() {
        return ing_url;
    }

    public void setIng_url(String ing_url) {
        this.ing_url = ing_url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
