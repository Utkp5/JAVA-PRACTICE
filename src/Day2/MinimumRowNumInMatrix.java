package Day2;

public class MinimumRowNumInMatrix {
    
    public static void main(String[] args) {
    
        int [][] arr = {{0,2,3},{4,5,2},{8,4,9}};

        

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }

        for (int i = 0; i < arr.length; i++) {

            int min = arr[i][0];

            for (int j = 0; j < arr.length; j++) {
                
                if (arr[i][j] < min) {
                    
                    min = arr[i][j];
                }
            }
            System.out.println("Minimum Element in row "+ (i+1) +" matrix is : "+ min);
        }


    }

}
