package Day6;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Optional_Class {
    
    public static void main(String[] args) {
        
        List<String> name =  Arrays.asList("Rahat", "Shivi", "Rahul", "Avi", "Tannu");

        // String nam = name.stream()
        //                  .filter(str -> str.contains("i"))
        //                  .findFirst();                        // It is giving error to make it error free we have used a concept called Optional class
        
                         
        Optional<String> nam = name.stream()
                         .filter(str -> str.contains("i"))
                         .findFirst();                        // concept called Optional class
        
        System.out.println(nam.get());
        
        String nam1 = name.stream()
                                    .filter(str -> str.contains("R"))
                                    .findAny()
                                    .orElse("Not found");

        System.out.println(nam1);

    }

}
