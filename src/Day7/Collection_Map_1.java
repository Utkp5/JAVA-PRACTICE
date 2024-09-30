package Day7;


import java.util.Arrays;
import java.util.List;

public class Collection_Map_1 {
    
    public static void main(String[] args) {
        	

        List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");

        //before streams

        // for (String name : vehicles) {
            
        //     System.out.println(name + " " + name.length());
        // }
       


        vehicles.stream().map(m -> m.length()).forEach(m -> System.out.println(m));
        // vehicles.stream().map(m -> m.length()).forEach(System.out::println);     ---one n the same thing
          
        
    }
}
