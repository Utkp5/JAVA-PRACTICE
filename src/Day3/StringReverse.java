package Day3;
import java.util.*;

public class StringReverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char newst;
		String rev="";
		
		System.out.print("Enter Any String : ");
		String st = sc.nextLine();
		
		//===========Method1 - length(), charAt()
		
		/*
		for(int i=st.length()-1;i>=0;i--)
		{
			newst = st.charAt(i);
			rev = rev+newst;
		}
		System.out.println("-----------Reverse----------");
		System.out.println(rev);
		*/
		
		
		
		//==========Method2 - by converting string to char array
		
		/*String s="welcome";
		String rev="";
				
		char a[]=s.toCharArray();                 // this will convert string to character type array
		System.out.println(Arrays.toString(a));  //[w, e, l, c, o, m, e]
				
		for(int i=a.length-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
				
		System.out.println("Reverse string:"+ rev);
		*/
		
		
		//===============Method3 - using StringBuffer
		/*
		StringBuffer s=new StringBuffer("welcome");
		System.out.println(s.reverse());
		*/
				
		
		//===============Method4 - using StringBuilder
		StringBuilder s=new StringBuilder("welcome");
		System.out.println(s.reverse());		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
	}
	
}
