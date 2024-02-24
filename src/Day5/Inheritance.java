package Day5;

/*            In this Single(A,B are single) and multi(A,B,C are multi) level we have*/

class A
{
	int a=10;
	void display()
	{
		System.out.println(a);
	}
}

class B extends A
{
	int b=20;
	void show()
	{
		System.out.println(a+b);
	}
}

class C extends B
{
	int c=50;
	void print()
	{
		System.out.println(a+b+c);
	}
}



public class Inheritance {

	public static void main(String[] args) {
		
		B obj = new B();
		obj.show();
		
		C obj1 = new C();
		obj1.print();
		
	}
}
