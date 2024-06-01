package com.realestate.backend.Standalone;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Java11Features {
    public static void StringMethodsNew(){
        //repeat method
        String str="Sai Manideep Bokka ";
        String str2="";
        System.out.println(str.repeat(2));
        System.out.println(str2.repeat(2));

        //strip method
        String stripStr="\n\t  hello   \u2005";
        System.out.println(stripStr);
        System.out.println(stripStr.strip());

        //trim method
        String trimStr="\n\t  hello   \u2005";
        System.out.println(trimStr.strip());


    }
    public  void instanceMethods(){
        //isBlank method
        String blankstr="\n \t \u2005";
        System.out.println(blankstr.isBlank());

        //lines method
        String multilineStr = "This is\n \n a multiline\n string.";
        System.out.println(multilineStr);
        System.out.println(multilineStr.lines().count());

        System.out.println(multilineStr.lines().filter(x-> !x.isBlank()).count());
    }
    public void testFilesNewMethods() throws IOException {
        String tempDir="C:\\Users\\saima\\Downloads";
        Path filePath = Files.writeString(Files.createTempFile(Path.of(tempDir), "demo", ".txt"), "Sample text");
        String fileContent = Files.readString(filePath);
        System.out.println(fileContent);

        Path filePath1=Files.writeString(Files.createTempFile(Path.of(tempDir),"Manideep1234",".pdf"),"Bokka Sai Manideep");
        String fileContentFromPdf=Files.readString(filePath1);
        System.out.println(fileContentFromPdf);
    }
    public void toArrayMethodOfAnyCollection(){
        List<String> list1= List.of("manideep","bokka");
        String[] sampl1=list1.toArray(String[]::new);
        System.out.println(sampl1.toString());
    }
    public static void main(String[] args) throws IOException {
        StringMethodsNew();
        Java11Features java11Features=new Java11Features();
        java11Features.instanceMethods();
        //java11Features.testFilesNewMethods();
        java11Features.toArrayMethodOfAnyCollection();
    }


}
