package patternsUsingLoops;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		for(int j=0;j<n;j++)
		{
			for(int i=0;i<n;i++)
			{
				if(i==0 || j==0 || i==n-1 || j==n-1||i+j<=(n-1)/2 || j-i>=(n-1)/2 || i+j>=(n-1)+(n-1)/2 || i-j>=(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		

	}

}
