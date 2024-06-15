package com.realestate.backend.learnjackson;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class JsonManRef {
    public int id;
    public String itemName;
    @JsonManagedReference
    public JsonBackRef owner;
}
