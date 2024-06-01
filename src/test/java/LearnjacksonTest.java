import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.realestate.backend.learnjackson.*;
import com.realestate.backend.learnjackson.deserialize.JsonCreatorEx;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LearnjacksonTest {

    @Test
    void test_whether_jackson_getter_any_works() throws JsonProcessingException {
        JsonAnyGetterEx jsonAnyGetterEx =new JsonAnyGetterEx("Manideep");
        jsonAnyGetterEx.add("Age","23");
        jsonAnyGetterEx.add("Debt","1 Million");
        jsonAnyGetterEx.add("Package","0.8 Million");
        jsonAnyGetterEx.add("Stress","5/5");

        System.out.println(new ObjectMapper().writeValueAsString(jsonAnyGetterEx));
    }

    @Test
    void test_whether_jackson_JsonGetter_works() throws JsonProcessingException {
        JsonGetterEx json = new JsonGetterEx("Manideep",2102150);
        System.out.println(new ObjectMapper().writeValueAsString(json));
    }

    @Test
    void test_whether_jackson_JsonPropOrder_works() throws JsonProcessingException {
        JsonPropertyOrderEx propertyOrderEx=new JsonPropertyOrderEx(2102150,
                "Sai Manideep","Bokka", 23);
        System.out.println(new ObjectMapper().writeValueAsString(propertyOrderEx));
    }

    @Test
    void test_whether_jackson_JsonRawValue_works() throws JsonProcessingException {
        JsonRawValueEx jsonRawValueEx=new JsonRawValueEx("Manideep","{\"color\": \"gold\",\"number\": 123}");
        System.out.println(new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(jsonRawValueEx));
    }

    @Test
    public void whenSerializingUsingJsonValue_thenCorrect()
            throws  JsonProcessingException {

        String enumAsString = new ObjectMapper()
                .writeValueAsString(JsonValueEx.TYPE1);

        System.out.println(enumAsString);
    }

    @Test
    void test_whether_JsonRootName_ex_works() throws JsonProcessingException {
        JsonRootNameEx jsonRootNameEx=new JsonRootNameEx(2102150,"Sai Bokka");
        ObjectMapper obj=new ObjectMapper();
        obj.enable(SerializationFeature.WRAP_ROOT_VALUE);
        System.out.println(obj.writerWithDefaultPrettyPrinter()
                .writeValueAsString(jsonRootNameEx));
    }

    @Test
    void test_whether_JsonSerializeEx_works() throws ParseException, JsonProcessingException {
        SimpleDateFormat df
                = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

        String toParse = "20-12-2014 02:30:00";
        Date date = df.parse(toParse);
        JsonSerializeEx jsonSerializeEx=new JsonSerializeEx("Party",date);
        System.out.println(new ObjectMapper().writeValueAsString(jsonSerializeEx));
    }

    @Test
    void whenDeserializingUsingJsonCreator_thenCorrect()
            throws IOException {
        String json = "{\"id\":1,\"theName\":\"My bean\"}";
        JsonCreatorEx bean = new ObjectMapper()
                .readerFor(JsonCreatorEx.class)
                .readValue(json);
        System.out.println(bean.name);
    }
}
