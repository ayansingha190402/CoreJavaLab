/* Program : DivideDemo
@author: Ayan Singha
@Lab Assesment by SHURUTI SINGHAL Mam 
@Date : 8 Sep 2022
@Version: 1
*/

// Declaring the class DivideDemo
class DivideDemo
{
	public static void main(String args[])     //Calling The Main Method
	{
		// taking input
		float dividend= Float.parseFloat(args[0]);
		float divisor= Float.parseFloat(args[1]);
		
		//calculating quotient
		float quotient = dividend/divisor; 
		int inQuotient =(int) (quotient);

		//calculating remainder
		float remainder = dividend%divisor;
		int inRemainder = (int)(remainder);
		
		//printing the value of quotient in floating point
		System.out.println("The Quotient in floating point is : "+quotient);
		
		//printing the value of remainder in floating point
		System.out.println("The Remainder floating point is : "+remainder);
		
		//printing the value of quotient in integer form
		System.out.println("The Quotient in Integer form is : "+inQuotient);
		
		//printing the value of remainder integer form
		System.out.println("The Remainder Integer form is : "+inRemainder);


	} // End of the main method
	


} // End of the class DivideDemo
