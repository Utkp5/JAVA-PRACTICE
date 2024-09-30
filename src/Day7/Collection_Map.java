package Day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collection_Map {
    
    public static void main(String[] args) {
        	

        List<String> vehicles = Arrays.asList("bus", "car", "bicycle", "flight", "train");
        List<String> newVehicles = new ArrayList<String>();


        //before streams

        /* for (String name : vehicles) {
            
            newVehicles.add(name.toUpperCase());
        }
        System.out.println(newVehicles);  */


        newVehicles =  vehicles.stream().map(m -> m.toUpperCase()).toList();
        System.out.println(newVehicles);  
        
    }
}
