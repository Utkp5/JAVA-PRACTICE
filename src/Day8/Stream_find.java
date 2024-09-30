package Day8;

import java.util.*;


public class Stream_find {
    

    public static void main(String[] args) {
        
        //findAny()
		List<String> stringList = Arrays.asList("one","two","three","one");

		Optional<String> ele = stringList.stream().findAny();
		System.out.println(ele.get()); //one 
		
		
		//findFirst()
		List<String> stringList1 = Arrays.asList("one","two","three","one");
		
		Optional<String> ele1 = stringList1.stream().findFirst();
		
		System.out.println(ele1.get());   //one  


    }
}
