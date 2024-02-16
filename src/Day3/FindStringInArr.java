package Day3;
import java.util.Scanner;

public class FindStringInArr {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s[] = new String[5];
		boolean res = false;
		
		System.out.println("Enter 5 String : ");
		
		for(int i=0;i<s.length;i++)
		{
			s[i] = sc.next();
		}
		
		System.out.print("Enter The String U Want To Search : "); //ram
		String search = sc.next();
		
		for(String find:s)
		{
			if(search.equalsIgnoreCase(find)) //equalsignorecase means even if we write string in caps it will going to compare it ignore case sensitive  
			{
				res = true;
			}
		}
		
		if(res)
		{
			System.out.println("Searched String is present in array!");
		}
		else {
			System.out.println("Searched String is not present in array!");
		}
		
		
		sc.close();
	}
	
}
