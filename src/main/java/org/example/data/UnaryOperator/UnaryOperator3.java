package org.example.data.UnaryOperator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnaryOperator3 {
    public static void main(String[] args) {
        List<Integer>integerList= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer>result=math(integerList,x->x*2);
        System.out.println(result);
    }
    public static <T>List<T>math(List<T>integerlist,UnaryOperator<T>uo){
        List<T>result=new ArrayList<>();
        for (T t:integerlist){
            result.add(uo.apply(t));
        }
      return result;
    }
}
