package com.aydanilozyurek.lansmarkbookjava;

import java.io.Serializable;

public class LandMark implements Serializable {

    String name;
    String country;
    int image;

    public LandMark(String name, String country, int image){
        this.country = country;
        this.name = name;
        this.image = image;
    }
}
