package Day5;

public class WrapperClass {
    
    public static void main(String[] args) {
        
        int num = 5;
        
        //Integer num1 = new Integer(num);     //boxing
    	Integer num1 = num;                  // autoboxing
        System.out.println(num1);
        
        Integer num2  = num1;
        Integer num3 = num2.intValue();     // unboxing
        System.out.println(num3);


        String str="12";
    	int num4 = Integer.parseInt(str);
    	
    	System.out.println(num4 + 2);



    }

}
