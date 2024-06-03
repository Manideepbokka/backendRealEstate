package com.realestate.backend.learnjackson.ignore;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@JsonIncludeProperties({"name"})
public class JsonIncludePropertiesEx {
    public int id;
    public String name;
}
