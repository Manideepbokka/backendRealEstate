package com.realestate.backend.learnjackson;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

class CustomDeserializer extends StdSerializer<Date> {

    private static SimpleDateFormat simpleDateFormat= new SimpleDateFormat("dd-MM-yyyy");
    CustomDeserializer(){
        this(null);
    }

    public CustomDeserializer(Class<Date> o) {
        super(o);
    }

    @Override
    public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        jsonGenerator.writeString(simpleDateFormat.format(date));
    }
}
public class JsonSerializeEx {
    public String name;

    @JsonSerialize(using = CustomDeserializer.class)
    public Date eventDate;

    public JsonSerializeEx(String party, Date date) {
        this.name=party;
        this.eventDate=date;
    }
}
