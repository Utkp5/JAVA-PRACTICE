package Day3;

import java.util.Scanner;

public class StringRemoveJunk {

	public static void main(String[] args) {
		// Remove Junk or Special Characters in String
		// wel&&^^%%*())*come
		// output: welcome
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String : ");
		String txt = sc.next();
		
		String newString = "";
		newString  = txt.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(newString);
		
		sc.close();
	}

}
