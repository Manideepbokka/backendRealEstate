package com.realestate.backend.learnjackson.ignore;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
public class JsonIncludeEx {
    public int id;
    public String name;
}
