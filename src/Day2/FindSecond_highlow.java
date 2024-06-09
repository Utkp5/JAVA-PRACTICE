package Day2;
import java.util.*;

public class FindSecond_highlow {

	
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		
		Arrays.sort(arr);
		
		int second_lowest = arr[1];
		int second_highest = arr[arr.length - 2];
		
		System.out.println("Sorted :"+Arrays.toString(arr));
		System.out.println("Second Highest No. : "+second_highest);
		System.out.println("Second Lowest No.  : "+second_lowest);
		
		sc.close();
		
		
	}
	
}
