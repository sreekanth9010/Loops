package lexExerciseProblems;

import java.util.Scanner;

//a program to calculate the product of three positive integer values. However, if one of the integers is 7, consider only the values to the right of 7 for calculation. If 7 is the last integer, then display -1.
//
//Note: Only one of the three values can be 7.


public class Calc7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number1");
		int num1=sc.nextInt();
		System.out.println("enter number2");
		int num2=sc.nextInt();
		System.out.println("enter number3");
		int num3=sc.nextInt();
		int product=-1;
		sc.close();
		
		if(num1==7)
		{
			System.out.println(num2*num3);
		}
		else if(num2==7)
		{
			System.out.println(num3);
		}
		else if(num3==7)
		{
			System.out.println(product);
		}
		else
		{
			System.out.println(num1*num2*num3);
		}
	}

}
