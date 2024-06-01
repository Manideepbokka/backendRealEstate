package com.realestate.backend.learnjackson;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

import java.util.HashMap;
import java.util.Map;

public class JsonAnyGetterEx {

    public String name;

    private Map<String, String> properties;

    public JsonAnyGetterEx(String name1) {
        this.name=name1;
        this.properties=new HashMap<>();
    }

    @JsonAnyGetter(enabled = true)
    public Map<String, String> getProperties(){
        return properties;
    }

    public void add(String key, String val){
        this.properties.put(key,val);
    }
}
