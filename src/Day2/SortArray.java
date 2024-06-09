package Day2;
import java.util.*;

public class SortArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//for this we are taking length static
		
		Integer arr[] = new Integer[5];
		int temp =0;
		
		System.out.println("Enter the elements in Array : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}	
		System.out.println("--------Sorted Array-------");
		for(int newarr:arr)
		{
			System.out.print(newarr+" ");
		}
		
		//--------there is another method of doing sorting is to do using sort() method below----------
/*		
		Arrays.sort(arr); //Array is a class in Java's standard library allowing you to use its methods in your code. 
		
		System.out.println("Sorted array in Ascending order: " + Arrays.toString(arr)); //this will do in asce order
		
		//To do in desc order below is the code 
		
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println("Sorted array in Descending order: " + Arrays.toString(arr)); //this will do in desc order
*/		
		
		
		sc.close();
		
	}
	
}
