package Day2;

import java.util.Scanner;

public class Remove_duplicate_Array {

	//code to remove duplicate element from an array. ---pending
	
	public static void main(String a[])
	{
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int arr1[] = null;
		
		
		System.out.println("====Enter the Number in Array====");
		
		for(int i=0; i<arr.length; i++)
		{
			 arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length; j++)
			{
				 if(arr[i]==arr[j])
				 {
					 arr1[i] = arr[i];
				 }
			}
		}
		
	}
	
	
	
}
