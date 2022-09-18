package lexExerciseProblems;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int j=0;j<n;j++)
		{
			for(int i=0;i<n;i++)
			{
				if(j==0 || i==0 ||i+j<=n-1)
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
