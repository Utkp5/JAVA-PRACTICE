package Day1;
import java.util.*;

public class Average_Prime_no {

	//Code to find the average of prime no from a given range
	
	public static void main(String a[]) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number till where u want Prime Numbers : ");
		int input = sc.nextInt();		
		
		int countprimeno = 0;
		float avg = 0, sum = 0;
		
		for(int i=2; i<=input; i++)
		{
			int count = 0;
			for(int j=1; j<=input; j++)
			{
				
				if(i%j==0)
				{
					count++;
				}
				
			}
			if(count<=2)
			{
				System.out.print(i+" ");
				countprimeno++;
				sum = sum + i;
			}
		}
		avg = sum/countprimeno;
		System.out.println();
		System.out.println("CountPrimeNo : "+countprimeno);
		System.out.println("Sum of Prime No. is :" + sum);
		System.out.print("Average of Prime No. is :"+avg);
		
		
		
		
		
	}
	
}
