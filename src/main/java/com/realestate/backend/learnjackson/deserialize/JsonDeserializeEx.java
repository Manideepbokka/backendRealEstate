package com.realestate.backend.learnjackson.deserialize;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class CustomDateDeserializer  extends StdDeserializer<Date>{
    public static SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

    CustomDateDeserializer(){
        this(null);
    }
    CustomDateDeserializer(Class<?> c){
        super(c);

    }
    @Override
    public Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        String date=jsonParser.getText();
        try {
            return format.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
public class JsonDeserializeEx {
    public String name;

    @JsonDeserialize(using=CustomDateDeserializer.class)
    public Date eventDate;
}
