/* Program :Create piggy bank
@Part - 2 - Customer.java
@author: Ayan Singha
@Date : 29 Sep 2022
@Lab Assesment by Shuruti Singhal Mam 
@Version: 1
*/

//importing scanner class 
import java.util.Scanner;

//declaring the class Customer
class Customer
{
	
	
	//declaring the method displayBalance
	//with parameter - balance
	public static void displayBalance(double balance)
	{
		//creating object of PiggyBank class
		PiggyBank p1=new PiggyBank();
		
		//calling the method setAmount of class PiggyBank
		p1.setAmount(balance);
		
		//print
		System.out.println("\n Your piggy bank balance--> "+p1.getAmount());
	}//end
	
	
	//declaring the method displayBalance
	//method overloading
	//with no parameter
	public static void displayBalance()
	{
		//creating object of PiggyBank class
		PiggyBank p1=new PiggyBank();
		
		//calling the method getAmount of class PiggyBank
		//print
		System.out.println("\n Your piggy bank balance--> "+p1.getAmount());
	}//end
	
	//declaring the method choice
	//for user choice
	public static void choice()
	{
		//creating object of scanner class
		Scanner sc = new Scanner(System.in);
		
		//printing
		System.out.println("\n Press 1: For create a piggy bank with initial amount \n Press 2:For create a piggy bank with adding some money");
		System.out.println(" Press 3: For exit\n Enter your choice ");
		
		//taking user input
		//for choice
		int choice =sc.nextInt();
		
		//swith case
		//with variebale - choice
		switch(choice)
		{
			//different cases
			case 1: displayBalance();//calling the method displayBalance - non-parameterised one
					break;
			case 2: System.out.println("\n Enter amount you want to add");
					//taking user input
					//for amount - user want to add to piggy bank
					double amount =sc.nextDouble();
					//calling the method displayBalance - parameterised one 
					displayBalance(amount);
					break;
			case 3: break;//for exit
			default : System.out.println("\nWrong input..........");//default case
		}//end of switch case
	}//end 
	
	//declaring main method
	public static void main(String... args)
	{
		// calling the method choice
		choice();
	}//end
}//end of class Customer