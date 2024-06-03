package com.realestate.backend.learnjackson.ignore;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@JsonIgnoreProperties({"id"})
public class JsonIgnorePropertiesEx {
    public int id;
    public String name;
}
