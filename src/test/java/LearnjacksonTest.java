import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.realestate.backend.learnjackson.*;
import com.realestate.backend.learnjackson.deserialize.*;
import com.realestate.backend.learnjackson.ignore.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

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

    @Test
    void test_whether_JacksonInject_works() throws JsonProcessingException {
        String json="{\"name\":\"My bean\"}";
        InjectableValues ib=new InjectableValues.Std().addValue(int.class,1);

        JacksonInjectEx injectEx=new ObjectMapper()
                .reader(ib)
                .forType(JacksonInjectEx.class)
                .readValue(json);
        System.out.println(new ObjectMapper().writeValueAsString(injectEx));

    }

    @Test
    public void whenDeserializingUsingJsonAnySetter_thenCorrect()
            throws IOException {
        String json
                = "{\"name\":\"My bean\",\"attr2\":\"val2\",\"attr1\":\"val1\"}";

        JsonAnySetterEx bean = new ObjectMapper()
                .readerFor(JsonAnySetterEx.class)
                .readValue(json);
        System.out.println(new ObjectMapper().writeValueAsString(bean));
    }

    @Test
    public void whenDeserializingUsingJsonSetter_thenCorrect()
            throws IOException {

        String json = "{\"id\":1,\"name\":\"My bean\"}";

        JsonSetterEx bean = new ObjectMapper()
                .readerFor(JsonSetterEx.class)
                .readValue(json);
        System.out.println(new ObjectMapper().writeValueAsString(bean));
    }

    @Test
    public void whenDeserializingUsingJsonDeserialize_thenCorrect()
            throws IOException {

        String json ="{\"name\":\"party\",\"eventDate\":\"20-12-2014 02:30:00\"}";

        SimpleDateFormat df
                = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        JsonDeserializeEx event = new ObjectMapper()
                .readerFor(JsonDeserializeEx.class)
                .readValue(json);
        System.out.println(new ObjectMapper().writeValueAsString(event));
    }

    @Test
    void test_whether_deserializing_using_JsonAlias_works() throws JsonProcessingException {
        //String json="{\"fName\":\"Bokka\",\"lastName\":\"Manideep\"}";
        String json = "{\"f_name\": \"John\", \"lastName\": \"Green\"}";
        JsonAliasEx aliasEx=new ObjectMapper()
                .readerFor(JsonAliasEx.class)
                .readValue(json);
        System.out.println(new ObjectMapper().writeValueAsString(aliasEx));
    }

    @Test
    void test_whether_JsonIgnorePropertiesEx_works() throws JsonProcessingException {
        JsonIgnorePropertiesEx json=new JsonIgnorePropertiesEx(1, "manideep");
        System.out.println(new ObjectMapper().writeValueAsString(json));
    }

    @Test
    void test_whether_JsonIgnoreEx_works() throws JsonProcessingException {
        JsonIgnoreEx jsonIgnoreEx=new JsonIgnoreEx(1,"Manideep");
        System.out.println(new ObjectMapper().writeValueAsString(jsonIgnoreEx));
    }

    @Test
    public void whenSerializingUsingJsonIgnoreType_thenCorrect()
            throws JsonProcessingException, ParseException {

        JsonIgnoreTypeex.Name name = new JsonIgnoreTypeex.Name("John", "Doe");
        JsonIgnoreTypeex user = new JsonIgnoreTypeex(1, name);

        System.out.println(new ObjectMapper().writeValueAsString(user));

    }

    @Test
    void test_whether_JsonInclude_works() throws JsonProcessingException {
        JsonIncludeEx jsonIncludeEx=new JsonIncludeEx(1,null);
        System.out.println(new ObjectMapper().writeValueAsString(jsonIncludeEx));
    }

    @Test
    public void whenSerializingUsingJsonIncludeProperties_thenCorrect() throws JsonProcessingException {
        final JsonIncludePropertiesEx bean = new JsonIncludePropertiesEx(1, "My bean");
        System.out.println(new ObjectMapper().writeValueAsString(bean));

    }
    @Test
    public void whenSerializingUsingJsonAutoDetect_thenCorrect()
            throws JsonProcessingException {
        JsonAutoDetectEx bean = new JsonAutoDetectEx(1, "My bean");
        System.out.println(new ObjectMapper()
                .writeValueAsString(bean));
    }

    @Test
    void test_jackson_polymorphic_works() throws JsonProcessingException {
        double v = 0.0234;
        JacksonPolymorphic.Dog dog =
                new JacksonPolymorphic.Dog("Peter",v);
        JacksonPolymorphic jp=new JacksonPolymorphic(dog);

        System.out.println(
                new ObjectMapper()
                        .writerWithDefaultPrettyPrinter()
                        .writeValueAsString(jp)
        );
    }

//    @Test
//    public void whenDeserializingPolymorphic_thenCorrect()
//            throws IOException {
//        String json = "{\"animal\":{\"type\" : \"dog\",\"name\" : \"Peter\",\"barkVolume\" : 0.0234}}";
//
//        JacksonPolymorphic zoo = new ObjectMapper()
//                .readerFor(JacksonPolymorphic.class)
//                .readValue(json);
//
//        System.out.println(
//                new ObjectMapper()
//                        .writerWithDefaultPrettyPrinter()
//                        .writeValueAsString(zoo)
//        );
//    }

    @Test
    public void whenUsingJsonProperty_thenCorrect()
            throws IOException {
        JsonPropertyEx bean = new JsonPropertyEx(1, "My bean");

        System.out.println(new ObjectMapper().writeValueAsString(bean));

    }
    @Test
    public void whenSerializingUsingJsonFormat_thenCorrect()
            throws JsonProcessingException, ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        df.setTimeZone(TimeZone.getTimeZone("UTC"));
        String toParse = "20-12-2014 02:30:00";
        Date date = df.parse(toParse);
        JsonFormatEx event = new JsonFormatEx("party", date);
        System.out.println(new ObjectMapper().writeValueAsString(event));
    }

    @Test
    void when_serializing_using_json_unwrapped_thenCorrect() throws JsonProcessingException {
        JsonUnwrappedEx.Name js=new JsonUnwrappedEx.Name("John","Doe");
        JsonUnwrappedEx jsonUnwrappedEx=new JsonUnwrappedEx(1,js);
        System.out.println(new ObjectMapper().writerWithDefaultPrettyPrinter()
                .writeValueAsString(jsonUnwrappedEx));
    }

    @Test
    void test_whether_JsonView_works() throws JsonProcessingException {
        JsonViewEx item = new JsonViewEx(2,"book","John");

        System.out.println(new ObjectMapper()
                .writerWithView(Views.Public.class).writeValueAsString(item));

    }
    @Test
    void test_whether_json_man_back_references_works() throws JsonProcessingException {
        JsonBackRef jbr=new JsonBackRef(1,"Manideep");
        JsonManRef jmr=new JsonManRef(2,"Bokka",jbr);
        jbr.userItems.add(jmr);

        System.out.println(new ObjectMapper().
                writerWithDefaultPrettyPrinter()
                .writeValueAsString(jmr));

    }
}
