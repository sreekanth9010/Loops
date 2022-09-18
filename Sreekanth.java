package patternsUsingLoops;


//Program to print iNeuron and sreekanth
public class Sreekanth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=7;
		for(int j=0;j<n;j++)
		{
			for(int i=0;i<n;i++)
			{
				if(j==0 ||j==n-1 ||j==(n-1)/2 || i==0&& j<=(n-1)/2||i==n-1&& j>=(n-1)/2 )
				{
					System.out.print("#");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\t");
			for(int i=0;i<n;i++)
			{
				if(j==0||j==(n-1)/2 || i==0||i==n-1&& j<=(n-1)/2||i==j&&j>=(n-1)/2 )
				{
					System.out.print("#");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\t");
			for(int i=0;i<n;i++)
			{
				if(j==0||j==(n-1)/2 || j==n-1 || i==0 )
				{
					System.out.print("#");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\t");
			for(int i=0;i<n;i++)
			{
				if(j==0||j==(n-1)/2 || j==n-1 || i==0 )
				{
					System.out.print("#");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\t");
			for(int i=0;i<n;i++)
			{
				if( i==0 || j-i==(n-1)/2 || i+j==(n-1)/2 )
				{
					System.out.print("#");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\t");
			for(int i=0;i<n;i++)
			{
				if( i==0&&j>0 || i==n-1 && j>0 ||j==(n-1)/2 || j==0 &&i>0&&i<(n-1) )
				{
					System.out.print("#");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\t");
			for(int i=0;i<n;i++)
			{
				if( i==0 || i==n-1 || i==j )
				{
					System.out.print("#");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\t");
			for(int i=0;i<n;i++)
			{
				if( j==0 || i==(n-1)/2 )
				{
					System.out.print("#");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\t");
			for(int i=0;i<n;i++)
			{
				if( i==0 || i==(n-1) || j==(n-1)/2 )
				{
					System.out.print("#");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
		//int m=5;
		for(int j=0;j<n;j++)
		{
			for(int i=0;i<n;i++)
			{
				if(j==0 || i==(n-1)/2 || j==n-1)
				{
					System.out.print("@");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			
			System.out.print("\t");
		for(int i=0;i<n;i++)
		{
			if(i==0 || i==n-1 || i==j)
			{
				System.out.print("&");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.print("\t");
		for(int i=0;i<n;i++)
		{
			if(j==0 || j==n-1 || j==(n-1)/2 || i==0)
			{
				System.out.print("!");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.print("\t");
		for(int i=0;i<n;i++)
		{
			if(i==0 || j==n-1 || i==n-1)
			{
				System.out.print("#");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.print("\t");
		for(int i=0;i<n;i++)
		{
			if(i==0 || j==0 || j==(n-1)/2 || i==n-1 && j<=(n-1)/2 || i==j && j>=(n-1)/2)
			{
				System.out.print("$");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.print("\t");
		for(int i=0;i<n;i++)
		{
			if(i==0&&j>0&&j<n-1 || j==0  &&i>0 &&i<n-1 || i==n-1 && j<(n-1)&&j>0 || j==n-1 && i>0&&i<n-1)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.print("\t");
		for(int i=0;i<n;i++)
		{
			if(i==0 || i==n-1 || i==j)
			{
				System.out.print("&");
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
