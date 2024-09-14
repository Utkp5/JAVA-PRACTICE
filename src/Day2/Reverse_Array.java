package Day2;
import java.util.Scanner;

public class Reverse_Array {

	
	public static void main(String a[]) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer arr[] = new Integer[5];
		
		System.out.println("Enter the elements in Array : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("After Reverse ");
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i]+" ");
		}
		
		sc.close();
		
	}
	
}
