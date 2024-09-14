package Day3;
import java.util.*;

public class Character_occurrence {

	//Code to find occurrences of each character in a given string
	//input UTKARSH
	//U-1,T-1,K-1,A-1,R-1,S-1,H-1
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any String : "); //mama
		String input = sc.next();
		
		char ch[] = input.toCharArray();
		String temp = input;
		
		char count = 0;
		int j;
		
		
		for (char c : ch) {
			
			System.out.println(c);
		}
		
		
		for(int i=0; i<temp.length(); i++)
		{
			for(j=i; j<=ch.length-1; j++)
			{
				if (temp.charAt(i)==ch[j]) {
					ch[i] = ++count;
				}
			}
			System.out.println(count);
		}
		
		
		
		sc.close();

		
		
//		System.out.println(input);
		
		
	}
	
}
