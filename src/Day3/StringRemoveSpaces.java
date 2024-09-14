package Day3;

import java.util.Scanner;

public class StringRemoveSpaces {

	public static void main(String a[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String : ");
		String txt = sc.nextLine();     // i have used here nextline() not next() with next() it is not working
		
		String newstr = txt.replaceAll("\\s","");
		System.out.println(newstr);

		sc.close();
	}
	
}
