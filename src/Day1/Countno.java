package Day1;
import java.util.*;

public class Countno {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number :");
		long num = sc.nextLong();
		
		long findnum;
		long totaldigits = 0;
		long temp = num;
		int even = 0,odd = 0;
		
		
		//Below loop is to count the no. of digits u have entered!
//		while(temp>0)
//		{
//			temp = temp / 10;
//			totaldigits++;
//		}
//		System.out.println(totaldigits);
		
		
		
		while(temp>0)
		{
			findnum = temp%10;
			if(findnum%2==0) {
				even+=1;
			}
			else {
				odd=odd+1;
			}
		    temp = temp/10;
		}
		System.out.println("Even Number : "+even);
		System.out.println("Odd Number :  "+odd);
		
		sc.close();
	}

}
