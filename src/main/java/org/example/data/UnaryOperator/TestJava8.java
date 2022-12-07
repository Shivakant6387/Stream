package org.example.data.UnaryOperator;

import org.example.data.BigDecimal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestJava8 {
    public static void main(String[] args) {
        List<Staff>staff= Arrays.asList(new Staff(" mkyong",30,new BigDecimal(10000)),
                new Staff("jack",27,new BigDecimal(200000)),new Staff("lawrence",33,new BigDecimal(30000)));
        List<String>result=new ArrayList<>();
        for(Staff x:staff){
            result.add(x.getName());
        }
        System.out.println(result);
        List<String>collect=staff.stream().map(x->x.getName()).collect(Collectors.toList());
        System.out.println(collect);
    }
    }

