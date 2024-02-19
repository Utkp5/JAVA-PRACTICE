package Day4;

public class StaticExample {


//1) static methods can access static stuff(variable methods) directly without creating an object
//2) static methods can access non-static stuff through object
//3) non-static methods can access everything directly.
	
	static int s1 = 10;  //static variable
	double s2 = 20;   //non-static
	
	static void m1()  //static method
	{
		System.out.println("Im static method!");
	}
	
	void m2()   // non-static method
	{
		System.out.println("Im non-static method!");
	}
	
	void m()   // non-static
	{
		System.out.println(s1);
		System.out.println(s2);
		
		m1();
		m2();
		
	}
	
	/*public static void main(String[] args) {
		
		System.out.println(s1);
		m1();
		
		StaticExample se = new StaticExample();
		System.out.println(se.s2);
		se.m2();
		se.m();
				
		
	}*/
	
	
}


