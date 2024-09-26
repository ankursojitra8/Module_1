package com.Assighment_ModuleTwo_Java_Intro;


/*
   QUA. 2 -> Write a Java program that takes the user to provide a single character from the alphabet. 
   	Print Vowel or Consonant, depending on the user input.
  	If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
*/

public class JA_M2_CoreJava_Q2_Checking_For_Vowels_Or_Consonants_Based_On_Input
{
	public static void main(char input)
	{
	       if ((input>='a' && input<='z') || (input>='A' && input<='Z'))
	        {

	            if (input=='a' || input=='e' || input=='i' || input=='o' || input=='u' ||
	                input=='A' || input=='E' || input=='I' || input=='O' || input=='U')
	                System.out.println("Ans:) " +input+ "Ans:)  is a vowel. ");
	            else
	                System.out.println("Ans:) " +input+ " is a consonant. ");
	        }
	        else
	            System.out.println("Error: Invalid input. Please enter a single alphabet letter for check Vowel or Consonant.");
	    }

		public static void main(String[] args)
		{
			char input='c';  

			main(input);
		}
}
