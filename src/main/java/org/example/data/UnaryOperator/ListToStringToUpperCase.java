package org.example.data.UnaryOperator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListToStringToUpperCase {
    public static void main(String[] args) {
        List<String>strList2= Arrays.asList("a","b","c","d");
        List<String>alphaUpper= new ArrayList<>();
        for (String s:strList2){
            alphaUpper.add(s.toUpperCase());
        }
        System.out.println(strList2);
        System.out.println(alphaUpper);
        List<String>collect=strList2.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);
        List<Integer>integerList2=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer>collect2=integerList2.stream().map(n->n*2).collect(Collectors.toList());
        System.out.println(collect2);

    }
}
