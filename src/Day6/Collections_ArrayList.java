package Day6;

import java.util.ArrayList;

public class Collections_ArrayList {
    
// can accept duplicate values
//ArraList, LinkedList, vector----- these 3 Implementing List interface
//array have fixed size where as arraylist can grow dynamicaly, you can access and insert any value in any index


    public static void main(String[] args) {
        

        ArrayList<String> a = new ArrayList<String>();  
        a.add("Rahat");
        a.add("Utkarsh");
        a.add("Shivi");
        a.add("Rahat");

        System.out.println(a);

        a.add(2,"Student");

        System.out.println(a);

        a.remove(2);
        System.out.println(a.contains("Shivi"));
        System.out.println(a.indexOf("Rahat"));
        System.out.println(a.isEmpty());
        System.out.println(a.size());



    }


}
