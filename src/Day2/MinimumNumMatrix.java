package Day2;

public class MinimumNumMatrix {
    public static void main(String[] args) {
    
        int [][] arr = {{0,2,3},{4,5,2},{8,4,9}};
        int min = arr[0][0];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                
                if (arr[i][j] < min) {
                    
                    min = arr[i][j];
                }
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }

        System.out.println("Minimum Element in matrix is : "+ min);

    }
}
