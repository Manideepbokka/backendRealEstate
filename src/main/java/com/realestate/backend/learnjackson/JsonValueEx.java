package com.realestate.backend.learnjackson;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum JsonValueEx {
    TYPE1(1,"TYPE1"), TYPE2(2,"TYPE2");
    private int id;
    private String name;
//    public JsonValueEx(int id, String name){
//        this.id=id;
//        this.name=name;
//    }
    @JsonValue
    public String getName(){
        return name;
    }
}
