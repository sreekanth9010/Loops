package lexExerciseProblems;

import java.util.Scanner;

//program to find number divisible by its sum of digits
public class Sum {

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
			sum+=rem;
			number/=10;
		}
		System.out.println(sum);
		System.out.println(number);
		if(k%sum==0) {
			System.out.println(" the numner is divisible by sum of its dits");
		}
		else
		{
			System.out.println("not divisible..!");
		}

	}

}
