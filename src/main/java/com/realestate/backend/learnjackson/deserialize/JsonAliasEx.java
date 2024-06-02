package com.realestate.backend.learnjackson.deserialize;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JsonAliasEx {
    @JsonAlias({"fName","f_name"})
    private String firstName;

    private String lastName;
}
