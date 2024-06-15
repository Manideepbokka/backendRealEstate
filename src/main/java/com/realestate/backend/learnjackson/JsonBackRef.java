package com.realestate.backend.learnjackson;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

public class JsonBackRef {
    public int id;
    public String name;
    @JsonBackReference
    public List<JsonManRef> userItems;

    public JsonBackRef(int id, String name) {
        this.id = id;
        this.name = name;
        this.userItems=new ArrayList<>();
    }
}
