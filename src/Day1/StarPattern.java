package Day1;

public class StarPattern {
    

    public static void main(String[] args) {
        
        int star = 5;


        for(int i=0; i<star; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print("*");
            }
           System.out.println(" ");
        }
        
    }


}


//  i = 1  row = 5