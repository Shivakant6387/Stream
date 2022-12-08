package org.example.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapToList {
    public static void main(String[] args) {
        Map<Integer,String >stringMap1=new HashMap<>();
        stringMap1.put(21,"Mato Vogel");
        stringMap1.put(22,"Mato Vogel");
        stringMap1.put(23,"Mato Vogel");
        stringMap1.put(24,"Mato Vogel");
        stringMap1.put(25,"Mato Vogel");
        stringMap1.put(26,"Mato Vogel");
        stringMap1.put(27,"Mato Vogel");
        stringMap1.put(28,"Mato Vogel");
        stringMap1.put(29,"Mato Vogel");
        stringMap1.put(32,"Mato Vogel");
        stringMap1.put(42,"Mato Vogel");
        stringMap1.put(52,"Mato Vogel");
        stringMap1.put(62,"Mato Vogel");
        stringMap1.put(72,"Mato Vogel");
        stringMap1.put(82,"Mato Vogel");
        stringMap1.put(92,"Mato Vogel");
        stringMap1.put(43,"Mato Vogel");
        stringMap1.put(652,"Mato Vogel");
        stringMap1.put(255,"Mato Vogel");
        stringMap1.put(266,"Mato Vogel");
        stringMap1.put(256,"Mato Vogel");
        stringMap1.put(223,"Mally Vogel");
        stringMap1.put(232,"Mac Vogel");
        System.out.println(" \n1. Export map key to list...");
        List<Integer>result=stringMap1.keySet().stream().collect(Collectors.toList());
        result.forEach(System.out::println);
        System.out.println("\n2. export map value to list....");
        List<String >result2=stringMap1.values().stream().collect(Collectors.toList());
        result2.forEach(System.out::println);
        System.out.println("/n3. Export map value to list .... say no mac ");
        stringMap1.keySet().stream().filter(x-> x>235 ).collect(Collectors.toList()).forEach(System.out::println);

               // stringMap1.keySet().stream().collect(Collectors.toList()).forEach(System.out::println);
//                .filter()
//                .collect(Collectors.toList());

      //  result3.forEach(System.out::println);
    }
}
