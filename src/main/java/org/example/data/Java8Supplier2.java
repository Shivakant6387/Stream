package org.example.data;

import java.util.ArrayList;
import java.util.List;

public class Java8Supplier2 <T>{
    public static void main(String[] args) {
        Java8Supplier2<String >obj=new Java8Supplier2<>();
        List<String>list=obj.supplier().get();
    }
    public Supplier<List<T>>supplier(){
        return ArrayList::new;
    }

}
