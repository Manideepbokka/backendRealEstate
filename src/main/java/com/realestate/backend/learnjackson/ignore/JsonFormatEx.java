package com.realestate.backend.learnjackson.ignore;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;

import java.util.Date;

@AllArgsConstructor
public class JsonFormatEx {
    public String name;

    @JsonFormat(
            shape = JsonFormat.Shape.STRING,
            pattern = "dd-MM-yyyy hh:mm:ss"
    )
    public Date eventDate;
}
