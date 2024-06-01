package com.realestate.backend.learnjackson;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@JsonPropertyOrder({"age", "empId", "fName", "lName"})
public class JsonPropertyOrderEx {
    public int empId;
    public String fName;
    public String lName;
    public int age;
}
