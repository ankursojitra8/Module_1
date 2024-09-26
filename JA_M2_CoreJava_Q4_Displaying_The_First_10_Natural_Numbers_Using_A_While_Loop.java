package com.Assighment_ModuleTwo_Java_Intro;

/*
	 QUA. 4 -> Write a program in Java to input 5 numbers from keyboard and find their sum and average using for loop.
*/

public class JA_M2_CoreJava_Q4_Displaying_The_First_10_Natural_Numbers_Using_A_While_Loop
{
	public static void main(String[] args)
	{
		int[] numbers = {10, 20, 30, 40, 50}; 
        int sum=0;
        int count=numbers.length;

        for (int i = 0; i < count; i++)
        {
            sum+=numbers[i];
        }
        double average=(double) sum/count;

        System.out.println();
        System.out.println("Ans 1:) Sum of the entered numbers: " +sum);
        System.out.println("-----------------------------------------");
        System.out.println("Ans 2:) Average of the entered numbers: " +average);
	}
}
