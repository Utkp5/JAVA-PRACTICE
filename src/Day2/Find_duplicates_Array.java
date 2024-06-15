package Day2;

import java.util.Scanner;

public class Find_duplicates_Array {
	
	//How many times a number is Repeated..  not getting output according to me like---
	/*
	 arr[0] : 2
	 arr[1] : 0
	 
	 we can see how many times a particular element is repeated by slight chng in code 
	 */
	
	public static void main(String a[])
	{
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];		
		
		System.out.println("====Enter the Number in Array====");
		
		for(int i=0; i<arr.length; i++)
		{
			 arr[i] = sc.nextInt();
		}

		int count = 0;
		for(int i=0; i<arr.length; i++)
		{
			count = 0;
			for(int j=0; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					++count;
				}
			}
			if(count>1)
			{
				System.out.println(arr[i] + ":" + count);				
			}
		}
		
		
		
		sc.close();
		
		
		
	}
	
}















