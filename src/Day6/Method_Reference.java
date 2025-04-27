package Day6;

import java.util.Arrays;
import java.util.List;

public class Method_Reference {
    
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Rahat", "Shivi", "Rahul", "Avi", "Tannu");

        List<String> name = names.stream()
                                 .map(String::toUpperCase)   //here we are just specifying a method & along in which method it belongs
                                 .toList();
        System.out.println(name);
        name.forEach(i -> System.out.println(i));

        



    }
}
