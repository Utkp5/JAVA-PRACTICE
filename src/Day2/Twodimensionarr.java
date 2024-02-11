package Day2;

public class Twodimensionarr {

	public static void main(String[] args) {
		
		
		
		
		int [][]arr = {{100,200},{300,200},{400,600}};
		
		//1st approach
		
		/*for(int r=0;r<arr.length;r++)
		{
			for(int c=0;c<arr[r].length;c++)
			{
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}
		*/
		
		//2nd approach
		
		for(int a[]:arr)
		{
			for(int z:a)
			{
				System.out.print(z + " ");
			}
			System.out.println();
		}
		
	}
	
}
