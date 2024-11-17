package Lambda;

import java.util.Arrays;
import java.util.List;

public class streamMain {
    public static void main(String[] args){
        List<Integer> ls= Arrays.asList(1,2,3,4,5,6,7);

        ls.stream()
               .map(e ->e*e)
                .filter(e ->e%2==0)
               .forEach(e -> System.out.println(e));


    }
}
