package Day6;

import java.util.ArrayList;

public class ArrayList_practice {
    
    public static void main(String[] args) {
        
        ArrayList<String> al = new ArrayList<String>();
        al.add("apple");
        al.add("banana");
        al.add("cherry");
        al.add("mango");
        al.add("apple");

        System.out.println(al);

        al.remove(0);

        System.out.println(al);

        if (al.contains("orange")) {
            System.out.println("orange is present!");
        }

        System.out.println(al.size());

        for (int i = 0; i < al.size(); i++) {
            
            System.out.println(i + " " + al.get(i));

        }

        
    }

}
