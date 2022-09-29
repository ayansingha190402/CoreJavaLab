/* Program :Create piggy bank
@Part - 1 - PiggyBank.java
@author: Ayan Singha
@Date : 29 Sep 2022
@Lab Assesment by Shuruti Singhal Mam 
@Version: 1
*/

//declaring the class PiggyBank
public class PiggyBank {
	
	//declaring private varieable outside any method
	private double amount;
	
	//non - parameterised constructer 
	//but initialise the value amount=50
	public PiggyBank() {
		super();// as object is superclass of all class
		this.amount = 50; //initialise value of amount=50
	}
	
	//parameterised constructer 
	//parameter - amount
	//method overloadinbg
	public PiggyBank(double amount) {
		super();// as object is superclass of all class
		this.amount = amount ;
	}
	
	//getter for amount varieable
	public double getAmount() {
		return amount;
	}
	
	//setter for amount varieable
	public void setAmount(double amount) {
		this.amount = amount+50;
	}
	

}//end of class PiggyBank
