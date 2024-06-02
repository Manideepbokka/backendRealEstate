package com.realestate.backend.learnjackson.deserialize;

import com.fasterxml.jackson.annotation.JsonAnySetter;

import java.util.HashMap;
import java.util.Map;
public class JsonAnySetterEx {
    public String name;

    private Map<String, String> properties;
    public JsonAnySetterEx(){
        properties = new HashMap<>();
    }
    public Map<String, String> getProperties(){
        return properties;
    }
    @JsonAnySetter
    public void add(String property, String value){
        properties.put(property, value);
    }
}
