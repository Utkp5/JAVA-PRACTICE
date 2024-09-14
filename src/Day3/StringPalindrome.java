package Day3;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String rev = "";
		
		System.out.print("Enter the String : ");
		String txt = sc.next();
		
		for(int i=txt.length()-1; i>=0; i--) {
			
			rev = rev+txt.charAt(i);
		}
		System.out.println("Reverse : " + rev);
		
		if (txt.equals(rev)) {
			
			System.out.println("It's a palindrome");
		}
		else
		{
			System.out.println("It's not a palindrome");			
		}

		sc.close();
	}

}
