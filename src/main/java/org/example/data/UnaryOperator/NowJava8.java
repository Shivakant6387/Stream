package org.example.data.UnaryOperator;

import org.example.data.BigDecimal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NowJava8 {
    public static void main(String[] args) {
        List<Staff>staff= Arrays.asList(new Staff("Mely Vogel",34,new BigDecimal(100000)),
                new Staff("Jack Vogel",54,new BigDecimal(4000000)),
                new Staff("Jaly Vogel",78,new BigDecimal(30000000)));
        List<StaffPublic>result=staff.stream().map(temp->{
            StaffPublic obj=new StaffPublic();
            obj.setName(temp.getName());
            obj.setAge(temp.getAge());
            if("Jack Vogel".equals(temp.getName())){
                obj.setExtra("this field is for Jack Vogel only");
            }
            return obj;
        }).collect(Collectors.toList());
        System.out.println(result);
    }
}
