package org.example.data.UnaryOperator;

public class UnaryOperator2 {
    public static void main(String[] args) {
        Function<Integer,Integer>function=x->x*2;
        Integer result=function.apply(8);
        System.out.println(result);
        UnaryOperator<Integer>func=x->x*2;
        Integer result1=func.apply(8);
        System.out.println(result1);
    }
}
