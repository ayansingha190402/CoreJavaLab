/* Program : Java program to print a pattern like

    *
   * *
  * * *
 * * * *
* * * * *
#User Input  -->  No of rows 
@author: Ayan Singha
@Date : 15 Sep 2022
@Lab Assesment by Shuruti Singhal Mam 
@Version: 1
*/
import java.util.Scanner; // importing util pacakge to use  scanner class

class StarPatternDemo // start of class StarPatternDemo
{
	
	// declaring the method starPattern
	public static void starPattern()
	{
		
		//creating a object to use  Scanner class
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter no of rows -->");
		// taking user input in integer for the no of rows to be printed 
		int noOfRows=sc.nextInt();
		
		//declaring integer varieable equal to noOfRows
		int temp=noOfRows; 
		
		System.out.println("\n****  Star pattern  ****");
		 // starting of outer for loop --> it is for column
		for(int i=1;i<=noOfRows;i++)
		{
			System.out.println();// printing new line
			
			// starting of nested for loops --> it is for rows
			for(int j=temp-1;j>=1;j--) // ths nested loop is to print -> space 
			{
				System.out.print(" ");
			}
			temp--;
			for(int k=1;k<=i;k++) // ths nested loop is to print ->  * 
			{
				System.out.print("* ");
			}
			
		}
	
	}
	// end of method starPattern
	

	
	// declaring the main method 
	public static void main(String... args) //Calling the main method
	{
		//calling the function starPattern 
		starPattern();
	}  // end of main method
	
}  // end of class factorialDemo

