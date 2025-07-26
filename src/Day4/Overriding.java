package Day4;

/*
    Overriding means having same method naem with same parameters 
    It can be applied to any inheritance 
    with overriding we can acquire the properties(method) from parent class to child class 
    but body of method should be different in child class that we acquire from parent class
    Note: overloading belongs to polymorphism
    overriding can be achived in inheritance only but overloding can be achived in both inheritance & polymorphism

 */

class A 
{
    void message()
    {
        System.out.println("I'm in Class A");
    }
}


class B extends A
{
    void message()          // Method overriden here
    {   
        
        System.out.println("I'm in Class B");
    }
}

class C extends B
{
    void message()          // Method overriden here and we have chnaged the body of a method
    {
        System.out.println("I'm in Class C");
    }
}


public class Overriding {
    
    public static void main(String[] args) {
        
        B obj = new B();
        obj.message();

    }

}
