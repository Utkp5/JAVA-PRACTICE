package Advance_Day1;

enum status {
    Running, Pending, Failed, Success
}

public class Enumeration {
    
    public static void main(String[] args) {
        
        status ss = status.Running;
        status ss1[] = status.values();

        System.out.println(ss);

        for (status s : ss1) {
            
            System.out.println(s + " " + s.ordinal()); //here ordinal is basically a index number
        }


    }

}
