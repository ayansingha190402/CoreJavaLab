/* Program : Write a java program to print the tagline of any 5 companies (Enahnced switch case)
@author: Ayan Singha
@Date : 15 Sep 2022
@Lab Assesment by Shuruti Singhal Mam 
@Version: 1
*/

// importing util pacakge to use  scanner class
import java.util.Scanner;

// start of class SwitchCompanyTagline
class SwitchCompanyTagline  
{
	//declaring the method CompanyTagline
	static void CompanyTagline() 
	{
	
		//creating a object to use  Scanner class
		Scanner sc = new Scanner(System.in);
		
		//printing some message to user 
		System.out.println("\n\tChoose any one of this five comapnies :   -->");
		System.out.println("\n\t--> MICROSOFT \t--> GOOGLE \n\t--> ASUS \t--> INTEL \n\t--> APPLE");
		System.out.println("\n\tAND SEE THE MAGIC... ");
		
		// taking user input in String for companies names
		String company = sc.nextLine();
		
		//starting of enhance switch case 
		switch(company) 
		{
			
			case "MICROSOFT" -> System.out.println("\n\t Company--> MICROSOFT \n\t Tageline --> We believe in what people make possible."); // MICROSOFT
			case "GOOGLE"-> System.out.println("\n\t Company--> GOOGLE \n\t Tageline --> Don't be evil."); // GOOGLE
			case "ASUS" ->  System.out.println("\n\t Company--> ASUS \n\t Tageline --> Inspiring Innovation • Persistent Perfection."); // ASUS
			case "INTEL" ->  System.out.println("\n\t Company--> INTEL \n\t Tageline --> Intel shapes the future of technology."); // INTEL	
			case "APPLE" ->  System.out.println("\n\t Company--> APPLE \n\t Tageline --> Think Different."); // APPLE			
			default -> System.out.println("\n\t Wrong input......  "); // default case
					
		}// end of swith case
		
	}// end of method CompanyTagline
	
	//Calling the main method
	public static void main(String... args) 
	{
		// calling method CompanyTagline
		CompanyTagline() ;
		
    }  // end of main method 
	
	
}  // end of class SwitchCompanyTagline

