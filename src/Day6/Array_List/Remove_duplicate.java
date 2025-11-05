package Day6.Array_List;

import java.util.ArrayList;
import java.util.Scanner;

public class Remove_duplicate {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number in array : ");
        int num, size = 5;

        for (int i = 0; i < size; i++) {
            num = sc.nextInt(); 
            al.add(num);
        }

        System.out.println("Array : " + al);
        
        for (int i = 0; i < al.size(); i++) {
            
            for (int j = i+1; j < al.size(); j++) {
                
                if (al.get(i) == al.get(j)) {
                    
                    al.remove(i);
                }
            }

        }
        
        System.out.println("Unique Array numbers! : " + al);
        



    }

}
