package Day5;

/*                       Same method name with same parameter, functionality will get changed like within the {} whatever we write that will get changed */

class Bank
{
	double roi()
	{
		return 0.0;
	}
}

class ICICI extends Bank
{
	double roi()
	{
		return 10.5;
	}
}

class AXIS extends Bank
{
	double roi()
	{
		return 11.5;
	}
}


public class Overriding {

	public static void main(String[] args) {
		ICICI ic=new ICICI();
		System.out.println(ic.roi()); //10.5
		
		
		AXIS ax=new AXIS();
		System.out.println(ax.roi()); //11.5
		
		Bank bn=new Bank();
		System.out.println(bn.roi()); //0.0
	}
	
}
