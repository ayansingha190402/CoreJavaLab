/* Program : Calculating the simple interest
@author: Ayan Singha
@Lab Assesment by SHURUTI SINGHAL Mam 
@Date : 8 Sep 2022
@Version: 1
*/

// Declaring the class SimpleInterest
class SimpleInterest
{
	public static void main(String args[])     //Calling The Main Method
	{
		int time =5;
		// taking input
		float principalAmount= Float.parseFloat(args[0]);// taking input 
		float interestRate=Float.parseFloat(args[1]);// taking input 
		
		//calculating the simple interest
		float simpleInterset = (principalAmount* interestRate*time)/100;
		int inSimpleInterset = (int)(simpleInterset);
		
		//printing the value of simple interest in floating point
		System.out.println("The Simple Interest in floating point is : "+simpleInterset);
		
		//printing the value of simple interset integer form
		System.out.println("The Simple Interest in Integer form is : "+inSimpleInterset);


	} // End of the main method
	


} // End of class SimpleInterest