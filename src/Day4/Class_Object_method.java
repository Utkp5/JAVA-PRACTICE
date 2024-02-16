package Day4;

public class Class_Object_method {

	int id;
	String name;
	long sal;
	
	
	void show()
	{
		System.out.println(id + " " + name + " " + sal);
	}
	
	void setData(int i,String n,long s)
	{
		id=i;
		name=n;
		sal=s;
	}
	
	public static void main(String[] args) {
		
		Class_Object_method obj = new Class_Object_method();
		obj.setData(10,"Rahat",140000);
		obj.show();
	}
	
}
