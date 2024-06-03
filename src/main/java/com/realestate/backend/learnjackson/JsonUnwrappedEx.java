package com.realestate.backend.learnjackson;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

public class JsonUnwrappedEx {
    public int id;

    @JsonUnwrapped
    public Name name;

    public JsonUnwrappedEx(int id, Name name) {
        this.id = id;
        this.name = name;
    }

    public static class Name{
        public String firstname;

        public String lastName;

        public Name(String fn, String ln){
            this.firstname=fn;
            this.lastName=ln;
        }
    }
}
