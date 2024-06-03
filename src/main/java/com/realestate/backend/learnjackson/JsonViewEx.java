package com.realestate.backend.learnjackson;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class JsonViewEx {

    @JsonView(Views.Public.class)
    public int id;

    @JsonView(Views.Public.class)
    public String itemName;

    @JsonView(Views.Internal.class)
    public String ownerName;
}
