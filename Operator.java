package lexExerciseProblems;

import java.util.Scanner;

//hands on exercise problem to compute the intrest
public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p,t;
		float r;
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			System.out.println("please enter the principal amount :");
			p=sc.nextInt();
			System.out.println("please enter the time period :");
			t=sc.nextInt();
			System.out.println("please enter the rate of intrest:");
			r=sc.nextFloat();
			float intrest = (p*t*r)/100;
			System.out.println("The intrest calculated for the above given values is: "+intrest );
		}
		sc.close();

	}

}
