package Day5;

/*
    coverting primitive data into object or vica versa is known as WrapperClass
    this concept will help us in collections concept
 */


public class WrapperClass {
    
    public static void main(String[] args) {
        
        int num = 5;                           // this is normal primitive interger value 
        
        Integer x = 10;                         // this is wrapper class bcz it contains metho
        //if we write x. then it will show some methods


        //Integer num1 = new Integer(num);     //boxing
    	Integer num1 = num;                  // autoboxing--primitive type into object type
        System.out.println(num1);
        
        Integer num2  = num1;
        Integer num3 = num2.intValue();     // unboxing--object type into primitive type
        System.out.println(num3);


        String str="12";
    	int num4 = Integer.parseInt(str);
    	
    	System.out.println(num4 + 2);



    }

}
