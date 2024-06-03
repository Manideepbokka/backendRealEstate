package com.realestate.backend.learnjackson.ignore;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class JsonIgnoreEx {
    @JsonIgnore
    public int id;

    public String name;
}
