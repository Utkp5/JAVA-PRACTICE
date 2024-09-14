package Day5;

//Super keyword basically call the parent methods,varibale all things etc...
//and if we want to call parent constructor then we have to write Super(); condition at very first
//if we want any thing from parent along with child thing then we use super keyword  

class Animal {

	String color="white";
	
	void eat()
	{
		System.out.println("eating.....");
	}
	
}

class Dog extends Animal
{
	String color="black";
	
	void displayColor()
	{
		System.out.println(super.color); 
	}
	
	void eat()
	{
		System.out.println("eating bread");
		super.eat();
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.displayColor();		
		d.eat();
		
	}
	
}
