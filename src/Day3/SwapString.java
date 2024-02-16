package Day3;
import java.util.*;

public class SwapString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String temp = "";
		
		System.out.print("Enter first String : ");
		String fst = sc.next();
		
		System.out.print("Enter second String : ");
		String sec = sc.next();
		
		temp = fst;
		fst = sec;
		sec = temp;
		
		System.out.println("------After Swap-----");
		System.out.println(fst + " " + sec);
		
		sc.close();
	}
	
}
