package Day5;

/*Notes
--An abstract class is a class that cannot be instantiated (i.e., you cannot create an object of it).
--It may contain abstract methods (methods without a body) and non-abstract methods (regular methods with a body).
--It serves as a base class for other classes to extend and implement the abstract methods. 
--An abstract method has no body, only a method signature.
--It must be overridden in the subclass.
--If a class has even one abstract method, the class must be declared abstract.
--Abstract methods are like a contract — subclasses must provide the implementation.
--Abstract classes can have constructors, fields, and concrete methods.
--You must override all abstract methods in a non-abstract subclass.
 */



abstract class Animal {
    abstract void makeSound();   // abstract method

    public void eat() {
        System.out.println("This animal eats food.");
    }
    
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class AbstractKeyword {
    
    public static void main(String[] args) {
        
        Animal obj = new Dog();
        obj.eat();
        obj.makeSound();

    }

}
