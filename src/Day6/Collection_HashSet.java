package Day6;

import java.util.HashSet;
import java.util.Iterator;

public class Collection_HashSet {
    
//can not accept duplicate values
//Hashset, LinkedHashSet, TreeSet ------implementes set interface, does not accept duplicate values
//There is no guarantee that elements are stored in sequence order..., it stored randomly 


    public static void main(String[] args) {
        
        HashSet<String> hs = new HashSet<String>();

        hs.add("INDIA");
        hs.add("USA");
        hs.add("UK");
        hs.add("CANADA");
        hs.add("UK");

        System.out.println(hs);

        Iterator<String> i = hs.iterator();
        
        while (i.hasNext()) {
            System.out.println(i.next());
        }

 





    }



}
