package lexExerciseProblems;

import java.util.Scanner;

//a program to find out whether a number is a seed of another number.

//A number X is said to be a seed of number Y if multiplying X by its every digit equates to Y.
public class Seed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the number1:");
		int number1=sc.nextInt();
		System.out.println("please enter the number2:");
		int number2=sc.nextInt();
		sc.close();
		int k=number2;
		int mul=1;
		while(number2!=0)
		{
			int rem=number2%10;
			mul*=rem;
			number2/=10;
		}
		System.out.println(mul);
		System.out.println(number2);
		if((k*mul)==number1) {
			System.out.println(" the numner is seed");
		}
		else
		{
			System.out.println("not ssed..!");
		}
	}

}
