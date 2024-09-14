package Day5;

public class ThisKeyword {
    
    int a = 10;    ///here to access the global varibale means 10 inside getdata() then we have to use this keyword


    public void getdata()
    {
        int a = 40;
        System.out.println(a);
        System.out.println(a + this.a);
    }
        
    public static void main(String[] args) {
        
        ThisKeyword TK = new ThisKeyword();
        TK.getdata();

    }



}
