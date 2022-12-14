package org.example.data.UnaryOperator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnaryOperator4 {
    public static void main(String[] args) {
        List<Integer>integerList1= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer>result=math(integerList1 ,x->x*2,x->x+1);
        System.out.println(result);
    }
    public static <T>List<T>math(List<T>integerList ,UnaryOperator<T>uo,UnaryOperator<T>uo2){
        List<T>result=new ArrayList<>();
        for (T t:integerList){
            result.add(uo.andThen(uo2).apply(t));
        }
        return result;
    }
}
