package com.realestate.backend.learnjackson.ignore;

//@JsonTypename - defines a logical type name to use for annotated class
//@JsonSubTypes - indicates sub-types of the annotated type
//@JsonTypeInfo - indicates details of what type information to include in serialization
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class JacksonPolymorphic {

    public Animal animal;

    @JsonTypeInfo(
            use=JsonTypeInfo.Id.NAME,
            include= JsonTypeInfo.As.PROPERTY,
            property = "type")
    @JsonSubTypes({
            @JsonSubTypes.Type(value = Dog.class, name="dog"),
            @JsonSubTypes.Type(value = Cat.class, name="cat")
    })
    public static class Animal{
        public String name;

        public Animal(String name) {
            this.name=name;
        }
    }

    @JsonTypeName("dog")
    public static class Dog extends Animal{
        public double barkVolume;

        public Dog(String name,double v) {
            super(name);
            this.barkVolume=v;
        }
    }

    @JsonTypeName("cat")
    public static class Cat extends Animal{
        boolean likesCream;
        public int lives;

        public Cat(String name) {
            super(name);
        }
    }
}
