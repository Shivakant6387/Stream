package org.example.data;

import java.util.Arrays;
import java.util.List;

public class SupplierExample {
    public static void main(String[] args) {
       List<Student>getAllSupplier=StudentDataBase.getAllStudent();

        Supplier<Student> studentSupplier=()->{
            return new Student("Adam",3,3.5,"male", Arrays.asList("Dancing ","Reading","Singing"));
        };
        Student student=studentSupplier.get();
        System.out.println(student);
    }
}
