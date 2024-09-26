package com.Assighment_ModuleTwo_Java_Intro;

/*
	 QUA. 3 -> Write a Java program that takes a year from user and print whether that year is a leap year or not B19. 
	 	Write a program in Java to display the first 10 natural numbers using while loop.
*/

public class JA_M2_CoreJava_Q3_Checking_If_A_Year_Is_A_Leap_Year
{
	public static void checkLeapYear(int year)
	{
        if ((year%4==0 && year%100!=0) || (year%400==0))
            System.out.println("Ans 1:) " +year + " is a leap year.");
        else
            System.out.println("Ans 1:) " +year + " is not a leap year.");
    }
	public static void displayNaturalNumbers()
    {
        int count=1;
        System.out.println("Ans 2:) First 10 natural numbers:");

        while (count<=10)
	        {
            System.out.println(count);
            count++;
        }
    }
	public static void main(String[] args)
	{
		System.out.println();
        int year = 2024;
        checkLeapYear(year);
        
        System.out.println("----------------------------------");
        
        displayNaturalNumbers();
    }
}
