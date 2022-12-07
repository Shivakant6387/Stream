package org.example.data;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class StudentDataBase {
    public static Supplier<Student>studentSupplier=()->{
        return new Student("Adam",3,3.5,"male",Arrays.asList("Dancing ","Reading","Singing"));
    };
   public static List<Student>getAllStudent(){
       Student student1=new Student("Emily",3,3.3,"Female",Arrays.asList("Swimming ","basketball","football"));
       List<Student>student= Arrays.asList(student1);
       return student;
   }
}
