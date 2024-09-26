package com.Assighment_ModuleTwo_Java_Intro;

/*
	 QUA. 5 -> Write a program in Java to display the pattern like right angle triangle with a number.

1
1 2
1 2 3
1 2 3 4 
1 2 3 4 5
*/

public class JA_M2_CoreJava_Q5_Calculating_The_Sum_And_Average_Of_5_Numbers_Using_A_For_Loop
{
	public static void main(String[] args)
	{
		for(int i=1; i<=5; i++)            
		{
			for(int  j=1; j<=i; j++)       
			{
				System.out.print(j +" ");
			}
			System.out.println();
		} 
	}
}
