package Day1;
import java.util.*;

public class Reverseno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		long num = sc.nextLong();
		long temp = num;
		long rem = 0,rev = 0;
		
		while(temp>0)
		{
			rem = temp%10;
			rev = rev*10+rem;
			temp = temp/10;
		}
		
		if (rev == num) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Number is not a palindrome");
		}
		
		
		
		
		sc.close();
				
	}

}
