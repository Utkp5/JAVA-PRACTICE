package Day1;
import java.util.*;

public class SumofDigit {

	public static void main(String a[]) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Your favourite Number : ");
		long num = sc.nextLong();
		
		long temp = num;
		long sum = 0,n; 
		
		while(temp>0)
		{
			n = temp%10;
			sum = sum+n;
			temp/=10;
		}
		System.out.println("Sum of Digit is : "+sum);

		sc.close();
	}

}
