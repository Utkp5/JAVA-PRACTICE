package Day2;
import java.util.*;

public class FindElementInArr {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int len = 0,find = 0;
		boolean result = false;
		
		System.out.print("Enter Length of your Array  : ");
		len = sc.nextInt();
		int arr[] = new int[len];
		
		System.out.println("Enter Elements in Array : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter The Number u want to find in Array : ");
		find = sc.nextInt();
		
		for(int finding:arr)
		{
			if(finding==find)
			{
				result = true;
			}			
		}
		if(result)
		{
			System.out.println("Entered Number is their in Array! ");			
		}
		else 
		{
			System.out.println("Entered Number is not their in Array! ");
		}
				
		sc.close();
	}
	
}
