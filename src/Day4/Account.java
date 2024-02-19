package Day4;

public class Account {  //Encapsulation 


//wrapping up of data and methods in to single unit(class) is encapsulation
//all variables should be private.then only we can achieve encap
//we can access variables only through methods(setters & getters)
	
	
	
	private int accNo;
	private String name;
	private double amt;	
	
	public int getAccNo() { //getter method
		return accNo;
	}

	public void setAccNo(int accNo) {  //setter method
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmt() {
		return amt;
	}

	public void setAmt(double amt) {
		this.amt = amt;
	}
	

	public static void main(String[] args) {
		
		Account accObj = new Account();
		accObj.setAccNo(145);
		accObj.setName("Rahat");
		accObj.setAmt(10000);
		System.out.println("Account No. : "+ accObj.getAccNo());
		System.out.println("Name : " +accObj.getName());
		System.out.println("Amount : " +accObj.getAmt());
		
	}
	
}










