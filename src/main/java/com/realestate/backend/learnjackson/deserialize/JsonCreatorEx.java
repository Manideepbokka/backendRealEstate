package com.realestate.backend.learnjackson.deserialize;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class JsonCreatorEx {

    public int id;
    public String name;

    @JsonCreator
    public JsonCreatorEx(@JsonProperty("id") int id, @JsonProperty("theName") String name){
        this.id=id;
        this.name=name;
    }
}
