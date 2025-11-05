package Day2;

import java.util.Scanner;

public class Find_missing_No_inArray {

	//Find the missing no in Array like ex:-   ******pending*******
	/*
	   number should be in range  + should not have duplicate no.s 
	   logic ex:- {1,3,4,5,6} ---in this 2 is missing 
	   so to find that we have a logic 
	   1+2+3+4+5 = 21
	   1+3+4+5+6 = 19
	   21-19 = 2 (here is your ans)
	   
	 */
	
	public static void main(String a[]) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer arr[] = new Integer[5];
		System.out.println("Enter the elements in Array : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=1; j>=i; j++)
			{
				if(arr[j]-arr[i]==1 || arr[j]-arr[i]==2)
				{
					System.out.println("entered element in array is correct");
				}
			}
		}

		sc.close();
		
		
	}
	
}

















