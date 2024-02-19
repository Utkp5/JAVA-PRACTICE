package Day4;

public class StaticMain {
    
      public static void main(String[] args) {  //when we create main method in different class then we can access 
    	  										//variable and methods through classname
		System.out.println(StaticExample.s1);
		StaticExample.m1();  //like as u can see
		
		StaticExample se = new StaticExample();
		System.out.println(se.s2);
		se.m2();
		se.m();
				
		
	   }
	
}
