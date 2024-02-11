package Day2;
import java.util.*;

public class SumInArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		System.out.print("Enter the length in Array : ");
		int len = sc.nextInt();
		
		int []arr = new int[len];
		
		System.out.println("Enter the elements in Array : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int z:arr)
		{
			sum = sum+z;
		}
		System.out.println("Sum of elements in Array is : "+sum);
		
		sc.close();
	}
}
