package Day3;

import java.util.Arrays;

public class MutableVsImmutableEx {

	public static void main(String[] args) {

		int a[]= {20,30,50,10};
		int b[]=a;
		
		System.out.println(Arrays.toString(b)); //[20, 30, 50, 10]

		Arrays.sort(b);   // mutable - can change
		
		System.out.println(Arrays.toString(b)); //[10, 20, 30, 50]

		System.out.println(Arrays.toString(a)); //[10, 20, 30, 50]
		
		
	}

}
