package Day6;

import java.util.ArrayList;

public class Program {
    
    //**Print unique number from the list

    public static void main(String[] args) {
        

        int arr[] = {3,7,6,4,3,7,6,4,5,3};   //3-3, 7-2, 6-2, 4-2, 1-1, 5-1

        ArrayList<Integer> AL = new ArrayList<Integer>();
        

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            if (!AL.contains(arr[i])) {
                
                AL.add(arr[i]);
                count++;

                for (int j = i+1; j < arr.length; j++) {
                    
                    if (arr[j]==arr[i]) {
                        count++;
                    }
                }
                System.out.println(arr[i] + " Occured : " + count + " Times");
                if (count<=1) {
                    System.out.println("Unique No. in array is : " + arr[i]);
                }
            }
            

        }

    }


}
