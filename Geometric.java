package lexExerciseProblems;

import java.util.Scanner;

public class Geometric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter the number of sequences:");
		n=sc.nextInt();
		sc.close();
		for(int i=0;i<n;i++)
		{
			int result = (int) Math.pow(2, i);
			System.out.print(result);
			System.out.print(" ");
		}
	}

}
