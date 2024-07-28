package com.realestate.backend.Standalone;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TechMInterview {

    public static void main(String[] args) {
        String arr[]=new String[]{"1","11","111","1111","15"};
        List<String> stringList = List.of(arr);

        List<Integer> sortedArr=stringList
                .stream()
                .map(Integer::parseInt)
                .sorted(Comparator.reverseOrder())
                .toList();

        Set<String> a= new HashSet<>();
        a.add("manideep");
        a.add(new String("manideep"));



    }


}
