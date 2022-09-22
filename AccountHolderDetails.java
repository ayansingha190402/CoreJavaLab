/* Program : Write a  java program to create a BankAccount
 and display the people with balance less than 1000.
@author: Ayan Singha
@Lab Assesment by: Shruti Singhal Mam 
@Date : 21 Sep 2022
@Version: 1.0
*/


import java.util.Scanner; // importing util pacakge for scanner class 
class AccountHolderDetails {
 
    public static void main(String... args)
    {
 
			account_Details();
			
    }
	
	static  void  account_Details()
	{
		// Declaring an array of student
        BankAccount[] arr;
 
        // Allocating memory for 2 objects
        // of type student
        arr = new BankAccount[6];
 
        // Initializing the first element
        // of the array
        arr[0] = new BankAccount("A3B", "Ayan", 1001);
		
 
        // Initializing the second element
        // of the array
        arr[1] = new BankAccount("FD5", "Subhadip", 880);
		
		// Initializing the third element
        // of the array
        arr[2] = new BankAccount("PO6", "Jayanta",990);
		
		
		Scanner sc = new Scanner(System.in);
        
		//--------------------------------------------------------------//
		
		
		
		// Displaying all the customer data through for loop
		for(int i=0;i<3;i++)
		{
			//printing customer details using 
			//display method class BankAccount 
			arr[i].display();

		}
		
		//----------------------------------------------------------------------------------//
		System.out.println("Customer having lower than 1000 balance  \n\n ");
		// Displaying all the customer name whose balance less than 1000
		for(int i=0;i<3;i++)
		{
			//printing student details using 
			//display method class student 
			if(arr[i].balance<1000)
			{
				arr[i].display();
			}
			

		}
		
		
		
		
 
	}
}
 
// Creating a BankAccount class with
// UniqueId , name and balance  as a attributes
class BankAccount {
 
    public String  uniqueId;
    public String name;
	public int balance;
 
    // Student class constructor -parameterised constructer
    BankAccount(String uniqueId, String name, int balance)
    {
        this.uniqueId = uniqueId;
        this.name = name;
		this.balance = balance;
    }
 
    // display() method to display
    // the account holdres data  data
    public void display()
    {
        System.out.println("Account Holder Unique Id is: " + uniqueId + " "+"\n"
                           + " Name is: "
                           + name+"\nBalance:"+balance);
        System.out.println();
    }
	 
}//end of BankAccount class 