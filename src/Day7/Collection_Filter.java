package Day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collection_Filter {
    
    public static void main(String[] args) {
        

        /* ArrayList<Integer> numberList = new ArrayList<Integer>();

        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40);
        numberList.add(50);   instead of doing this we can do this */

        List<Integer> numList = Arrays.asList(10,14,73,21,40);
        List<Integer> evenList = new ArrayList<Integer>();


        //without using streams 
		
		/*for(int n:numList)
		{
			if(n%2==0)
				evenList.add(n);
		}
		
		System.out.println(evenList); */


        //with streams
		
        //1 way
        numList.stream().filter(n -> n%2==0).forEach(n -> System.out.println(n));
        //numList.stream().filter(n->n%2==0).forEach(System.out::println);   --- we can use this this also...

        //2 way
		evenList=numList.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evenList);
		



        
    }
}
