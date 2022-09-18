package lexExerciseProblems;

import java.util.Scanner;

public class Rabbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		int rabbits=0 ;
		int hens=0;
		int heads;
		int legs;
		int rem=0;
		Scanner sc = new Scanner (System.in);
		System.out.println("please enter number of heads :");
		heads=sc.nextInt();
		System.out.println("please enter number of legs :");
		legs=sc.nextInt();
		sc.close();
		if((legs)%2==0)
		{
			
			for(int i=0;i<=heads;i=i+2)
			{
				for(int j=heads;j>=0;j-=2)
				{
					if(i+j==heads&&( 2*i +4*j)==legs)
					{
						rabbits=j;
						hens=i;
					}
				}
			}
			
			
			System.out.println("The number of rabbits are :" +rabbits);
			System.out.println("The numnber of hens are :" +hens);
			
			
		}
		else
		{
			System.out.println("the combination doesnt exist..!");
		}
		
		
	}

}
