package org.example.data.UnaryOperator;

import org.example.data.BigDecimal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BeforeJava8 {
    public static void main(String[] args) {
        List<Staff> staff2 = Arrays.asList(new Staff("Jack Vogel", 50, new BigDecimal(20000)),
                new Staff("Mac Vogel", 443, new BigDecimal(300000)),
                new Staff("Jally Vogel", 54, new BigDecimal(400000)));
        List<StaffPublic> result = convertToStaffPublic(staff2);
        System.out.println(result);
    }

    private static List<StaffPublic> convertToStaffPublic(List<Staff> staff) {
        List<StaffPublic> result = new ArrayList<>();

        for (Staff temp : staff) {
            StaffPublic obj = new StaffPublic();
            obj.setName(temp.getName());
            obj.setAge(temp.getAge());
            if ("Mac Vogel".equals(temp.getName())){
                obj.setExtra("this field is for Mac Vogel only");
            }
            result.add(obj);
        }
        return result;
    }
}