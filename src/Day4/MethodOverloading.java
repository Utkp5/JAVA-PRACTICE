package Day4;

public class MethodOverloading {  //same name but with diff parameter

	int x,y; //class variable , instance variable
	double z;
	
	void sum()
	{
		x=10;
		y=20;
	}
	
	void sum(int a,int b) //local variable so if we create this local var then it will create extra space in memory to
	{                     // reduce this we use this keyword so that it won't create extra space.   
		x=a;
		y=b;
	}
	
	void sum(int a,double b)
	{
		x=a;
		z=b;
	}
	
	void sum(double a,int b)
	{
		z=a;
		y=b;
	}
	
	void display()
	{
		System.out.println(x + " " + y + " " + z);
	}
	
	public static void main(String[] args) {
		
		MethodOverloading mo = new MethodOverloading();
		//mo.sum();
		mo.sum(10,20.7);
		mo.display();
		
	}
}
