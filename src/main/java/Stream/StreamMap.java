package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String[] args) {
        List<Integer>number= Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer>square=number.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(square);
        //create a list to string
        List<String >names=Arrays.asList("Rovert Vogel ","Mato Kato ","Mac Vogel","Shado Vogel");
        List<String >result=names.stream().filter(x->x.startsWith("M")).collect(Collectors.toList());
        System.out.println(result);
        List<String >show=names.stream().sorted().collect(Collectors.toList());
        System.out.println(show);
        List<Integer>squareSet=number.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(squareSet);
        number.stream().map(x->x*x).forEach(y-> System.out.println(y));
        int even=number.stream().filter(x->x%2==0).reduce(0,(ans,i)->ans+i);
        System.out.println(even);
    }
}
