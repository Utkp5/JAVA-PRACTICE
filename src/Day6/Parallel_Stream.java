package Day6;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;


public class Parallel_Stream {

    public static void main(String[] args) {
        
        int size = 1000;

        List<Integer> num = new ArrayList<>(size);

        Random ran = new Random();
        ran.nextInt(100);

        for (int i = 0; i <=size; i++) {
            num.add((ran.nextInt(100)));
        }

        int sum1 = num.stream()
                      .map(n -> n*2)
                      .reduce(0, (c,e) -> c+e); //To overcome this we have maptoint feature which already have sum() fun in it
        System.out.println(sum1);

        int sum2 = num.stream()
                      .map(n -> n*2)
                      .mapToInt(n -> n)
                      .sum();

        System.out.println(sum2);


        int sum3 = num.parallelStream()
                      .map(n -> {
                        return n*2;                // we can do in this way as well
                      })
                      .mapToInt(n -> n)
                      .sum();

        System.out.println(sum3);

    }
    
}