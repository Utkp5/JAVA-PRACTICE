package Day5;

class A
{
	public void show() 
	{
		System.out.println("in A show");
	}
}
//class B extends A
//{
//	public void show()
//	{
//		System.out.println("in B Show");
//	}
//}

public class Anonymous_Inner_Class {
    
    public static void main(String[] args) {
    	
    	//A obj=new B();
    	
    	A obj = new A() 
    	{                      //this is anonymous inner claa
    		public void show()
    		{
    			System.out.println("in new show");
    		}
    	};
    	obj.show();
    }

}
