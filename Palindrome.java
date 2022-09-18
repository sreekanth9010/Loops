package lexExerciseProblems;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,k;
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the number :");
		k=number=sc.nextInt();
		sc.close();
		int reverse=0;
		while(number!=0)
		{
			int rem=number%10;
			reverse=reverse*10 + rem;
			number=number/10;
			
		}
		
		
		//System.out.println(reverse);
		if(k == reverse)
		{
			System.out.println("Plaindrome ..!");
		}
		else
		{
			System.out.println("Not a Plaindrome ..!");
		}
	}

}
