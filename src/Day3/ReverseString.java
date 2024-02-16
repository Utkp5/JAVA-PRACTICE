package Day3;
import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char newst;
		String rev="";
		
		System.out.print("Enter Any String : "); //ram
		String st = sc.nextLine();
		
		for(int i=st.length();i>0;i--)
		{
			newst = st.charAt(i-1);
			rev = rev+newst;
		}
		System.out.println("-----------Reverse----------");
		System.out.println(rev);
		
		
		
		sc.close();
	}
	
}
