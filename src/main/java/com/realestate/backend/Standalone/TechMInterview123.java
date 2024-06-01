package com.realestate.backend.Standalone;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
class A{
    int test=10;
    String getTest(){
        return "Class A";
    }
    String getClaasss(){
        return  "From Class A";
    }
}
class B extends  A{
    int test=20;
    String getTest(){
        return "Class B";
    }
//    String getClaasss(){
//        return  "From Class B";
//    }
}
public class TechMInterview123 {

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.test);
        System.out.println(a.getTest());

        B b = new B();
        System.out.println(b.test);
        System.out.println(b.getTest());

        A a1 = new B();
        System.out.println(a1.test);
        System.out.println(a1.getTest());
        System.out.println(a1.getClaasss());

//        B b1 = new A();
//        System.out.println(b1.test);
//        System.out.println(b1.getTest());

//        String arr[]=new String[]{"1","11","111","1111","15"};
//        List<String> stringList = List.of(arr);
//
//        List<Integer> sortedArr=stringList
//                .stream()
//                .map(Integer::parseInt)
//                .sorted(Comparator.reverseOrder())
//                .toList();
//
//        Set<String> a= new HashSet<>();
//        a.add("manideep");
//        a.add(new String("manideep"));

        

    }


}
