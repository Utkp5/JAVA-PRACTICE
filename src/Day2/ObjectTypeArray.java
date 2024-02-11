package Day2;

public class ObjectTypeArray {

	public static void main(String[] args) {
		
		Object obj[] = new Object[5];
	
		obj[0] = 'U';
		obj[1] = "Welcome";
		obj[2] = 100;
		obj[3] = 10.5;
		obj[4] = false;
		
		/*
		for(int i=0;i<obj.length;i++)
		{
			System.out.println(obj[i]);
		}
		*/
		
		//enhanced loop
		
		for(Object x:obj)
		{
			System.out.println(x);
		}
		
		
	}
}
