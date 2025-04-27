package Day6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_API {
    
    public static void main(String[] args) {
        
        List<Integer> num = Arrays.asList(4,2,6,1,8,7);

        System.out.println(num);

        Stream<Integer> s1 = num.stream();
        s1.forEach(n -> System.out.println(n));   // to print this, if we have get ouptut of s1 once then we call again s1 to print then it will thorw an error
        //s1.forEach(n -> System.out.println(n));   // error while prinitng bzc reason is written in above statement. 
        
        
        Stream<Integer> s2 = num.stream();
        Stream<Integer> s3 = s2.filter(n -> n%2==0);
        System.out.println("========");
        s3.forEach(n -> System.out.println(n));
        
        
        System.out.println("========");
        int result = num.stream()
                        .filter(n-> n%2==0)
                        .map(n->n*2)
                        .reduce(0, (c,e)-> c+e);
    	System.out.println(result);
        
        System.out.println("========");
        
        Stream<Integer> sortedValues = num.stream()
                                          .filter(n-> n%2==0)
                                          .sorted();
        sortedValues.forEach(n -> System.out.println(n));




    }

}
