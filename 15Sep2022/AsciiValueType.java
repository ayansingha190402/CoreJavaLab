/* Program :Java progam to find whether the character
 entered is vowel ,consonant ,number and special character
 
@author: Ayan Singha
@Date : 15 Sep 2022
@Lab Assesment by Shuruti Singhal Mam 
@Version: 1
*/

// importing util pacakge to use  scanner class
import java.util.Scanner; 
 
// declaring of class AsciiValueType
class AsciiValueType
{
	
	// declaring method CheckCharType
	static void CheckCharType()
	{	
	
		//creating a object to use  Scanner class
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter randomly anything from your keyboard  -->");
		// taking user random keyboard input 
		char userInput = sc.next().charAt(0);
		
		//implicit coversion for get ASCII value		
		int asciiVal = userInput; 
		
		// printing the ASCII value
		System.out.println("The ascii value of "+ userInput +" is :"+ asciiVal );
		
		/* Starting of if else ladder to check whether the character
		entered is vowel ,consonant ,number and special character*/
		if ((asciiVal>=65) && (asciiVal<=90)) // checking whether it is a upper case or not
		{
			System.out.println(" -> Hey, it is a capital letter");
			if ((userInput=='A') || (userInput=='E') || (userInput=='I') || (userInput=='O') || (userInput=='U')) // then checking whether it is a vowel or not
			{
				System.out.println(" ->And also, it is  a vowel");
			}
			else // else it is consonent
			{
				System.out.println(" ->And also, it is a consotent");
			}
		}
		else if ((asciiVal>=97) && (asciiVal<=122))// checking whether it is a lower case or not
		{
			System.out.println(" ->Hey,it is a small letter");
			if ((userInput=='a') || (userInput=='e') || (userInput=='i') || (userInput=='o') || (userInput=='u'))// then checking whether it is a vowel 
			{
				System.out.println(" ->And also, it is a vowel");
			}
			else   // else it is a consonent
			{
				System.out.println(" ->And also, it is a consotent");
			}
		}
		else if ((asciiVal>=48) && (asciiVal<=57))// checking whether it is a numeric or not 
		{
			System.out.println(" ->Hey,it is a number");
		}
		else// else it is other special character
		{
			System.out.println(" ->Hey,it is a special character");
		}
		
	}
	// end of  method checkCharType
	
	
	// declaring main method
	public static void main(String... arg)
	{
		
		// calling method CheckCharType
		CheckCharType() ;
	}
	// end of  main method
}
//end of  class AsciiValueType