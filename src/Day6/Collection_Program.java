package Day6;

import java.util.ArrayList;

public class Collection_Program {
 
//Write a program to find how many number are repeated in an array and also find a unique number 

    public static void main(String[] args) {
        
        int a[] = {4,3,7,4,2,3,7,5,2};

        ArrayList<Integer> al = new ArrayList<Integer>();

        for (int i = 0; i < a.length; i++) {
            
            int count = 0;
            
            if (!al.contains(a[i])) {
                
                al.add(a[i]);
                count++;

                for (int j = i+1; j < a.length; j++) {
                    
                    if (a[i] == a[j]) {
                        
                        count++;
                    }

                }
                System.out.println(a[i] + ":" + count);
            }

            
            if (count == 1) {
                System.out.println(a[i] + " is Unique number!");
                
            }
        }
        

    }
}
