package Day3;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) {

		
		//===========String - immutable - cannot change
		/*
		 String s="welcome";
		 s.concat("to java");
		 System.out.println(s);  //welcome
		*/
				
		
		//===========StringBuffer - mutable - can change 
		/*
		  StringBuffer s=new StringBuffer("welcome");
		  s.append("to java");
		  System.out.println(s); //welcometo java
		*/
				
		//===========StringBuilder - mutable - can change
		  StringBuilder s=new StringBuilder("welcome");
		  s.append("to java");
		  System.out.println(s); //welcometo java}

		
		
		
		
       }
}