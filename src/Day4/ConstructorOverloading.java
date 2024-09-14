package Day4;

public class ConstructorOverloading {

	
	int x,y;
	double z;
	
	ConstructorOverloading()
	{
		x=10;y=20;
	}
	
	ConstructorOverloading(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	ConstructorOverloading(int x,double z)
	{
		this.x=x;
		this.z=z;
	}
	
	void display()
	{
		System.out.println(x + " " + y + " " + z);
	}
	
	public static void main(String[] args) {
		
		ConstructorOverloading co = new ConstructorOverloading();
		ConstructorOverloading co1 = new ConstructorOverloading(500,100);
		ConstructorOverloading co2 = new ConstructorOverloading(500,1000.0);

		co.display();
		co1.display();
		co2.display();
		
		
	}
	
}
