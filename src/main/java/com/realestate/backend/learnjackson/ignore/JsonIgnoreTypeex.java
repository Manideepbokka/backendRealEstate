package com.realestate.backend.learnjackson.ignore;
import com.fasterxml.jackson.annotation.JsonIgnoreType;

public class JsonIgnoreTypeex {
    public int id;
    public Name name;

    public JsonIgnoreTypeex(int i, Name name) {
        this.id=i;
        this.name=name;
    }

    @JsonIgnoreType
    public static class Name {
        public String firstName;
        public String lastName;

        public Name(String fn, String ln) {
            this.firstName=fn;
            this.lastName=ln;
        }
    }
}