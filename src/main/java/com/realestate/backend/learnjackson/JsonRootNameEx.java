package com.realestate.backend.learnjackson;

import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.AllArgsConstructor;

@JsonRootName(value="User")
@AllArgsConstructor
public class JsonRootNameEx {
    public int empId;
    public String empName;
}
