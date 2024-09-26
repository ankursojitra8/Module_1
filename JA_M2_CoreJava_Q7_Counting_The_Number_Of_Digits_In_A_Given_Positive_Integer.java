package com.Assighment_ModuleTwo_Java_Intro;

/*
	QUA. 7 -> Write a Java program that reads a positive integer and count the number of digits the number.
		• Input an integer number less than ten billion: 125463
		• Number of digits in the number: 6
*/

public class JA_M2_CoreJava_Q7_Counting_The_Number_Of_Digits_In_A_Given_Positive_Integer
{
	public static void main(String[] args)
	{
		long number=125463;
        int count=0;
        long temp=number;
        while(temp!=0)
        {
            temp/=10;
            count++;
        }

        System.out.println();
        System.out.println("Ans 1:) Input integer number : " +number);
        System.out.println("------------------------------------------------");
        System.out.println("Ans 2:) Number of digits in the number : " +count);
	}
}
