package lexExerciseProblems;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;
		int fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for which factorial should be found :");
		number=sc.nextInt();
		sc.close();
		for(int i=1;i<=number;i++)
		{
			fact*=i;
		}
		System.out.println("The factorial of the given "+ number +" is :" +fact );

	}

}
