package Day8;

import java.util.*;
import java.util.stream.Stream;

public class Stream_concatenation {
    

    public static void main(String[] args) {
        
        List<String> animalsList = Arrays.asList("Dog","Cat","Elephant");
		List<String> birdsList = Arrays.asList("peackock","parrot","Crow");
		
		
		Stream<String> stream1 = animalsList.stream();
		Stream<String> stream2 = birdsList.stream();
		
		List<String> finallist=Stream.concat(stream1, stream2).toList();
		
		
		for(String item:finallist)
		{
			System.out.println(item);
		}

    }
}
