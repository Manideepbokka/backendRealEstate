package com.realestate.backend.learnjackson;

import com.fasterxml.jackson.annotation.JsonRawValue;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class JsonRawValueEx {
    public String name;

    @JsonRawValue
    public String jsonvalue;
}
