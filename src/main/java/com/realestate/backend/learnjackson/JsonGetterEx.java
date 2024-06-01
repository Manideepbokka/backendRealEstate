package com.realestate.backend.learnjackson;

import com.fasterxml.jackson.annotation.JsonGetter;

public class JsonGetterEx {
    private String name;

    public int id;

    @JsonGetter("FullName")
    public String getName(){
        return this.name;
    }

    public JsonGetterEx(String name, int id){
        this.name=name;
        this.id=id;
    }
}
