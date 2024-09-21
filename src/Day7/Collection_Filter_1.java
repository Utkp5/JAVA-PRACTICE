package Day7;

import java.util.Arrays;
import java.util.List;


public class Collection_Filter_1 {
    
    public static void main(String[] args) {
        

        List<String> nameList = Arrays.asList("Shivi","Rahat","utkarsh","Rohit","ravi");

        nameList.stream().filter(s -> s.length()>4 && s.length()<6).forEach(s -> System.out.println(s));



        
    }
}
