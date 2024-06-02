package com.realestate.backend.learnjackson.deserialize;

import com.fasterxml.jackson.annotation.JsonSetter;

public class JsonSetterEx {

    public int id;

    public String name;

    @JsonSetter("name")
    public void setTheName(String name){
        this.name=name;
    }
}
