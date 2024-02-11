package Day1;
import java.util.*;

public class Countno {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number :");
		long num = sc.nextLong();
		
		long findnum;
		long temp = num;
		int even = 0,odd = 0;
		
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
