package Practice;

import java.util.*;

public class Practice {

    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<String>();
    a.add("apple");
    a.add("banana");
    a.add("cherry");
    a.add("mango");
    a.add("apple");
    System.out.println(a);
    a.remove("apple");
    System.out.println(a);
    
    boolean res = a.contains("orange");
    if (res)
    {
        System.out.println("orange is found");
    }else {
        System.out.println("orange is not found");
    }
    
    System.out.println(a.size());
    
    for (int i=0;i<a.size();i++)
    {
        System.out.println(i + " " + a.get(i));
    }
    
        
    }











}
