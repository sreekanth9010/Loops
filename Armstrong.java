package lexExerciseProblems;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the number:");
		int number=sc.nextInt();
		sc.close();
		int k=number;
		int sum=0;
		while(number!=0)
		{
			int rem=number%10;
			sum+=Math.pow(rem, 3);
			number/=10;
		}
		System.out.println(sum);
		System.out.println(number);
		if(k==sum) {
			System.out.println(" armstrong");
		}
		else
		{
			System.out.println("not armstrong..!");
		}

	}

}
