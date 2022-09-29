/* Program :Write a program to print sum of even and 
odd numbers using varargs.
 
@author: Ayan Singha
@Date : 29 Sep 2022
@Lab Assesment by Shuruti Singhal Mam 
@Version: 1
*/

//declaring the class VaragsEvenOdd
class VaragsEvenOdd
{
	//declaring the method allNo
	//for printing all no
	static void allNo(int ...demoArray)
	{
		//print
		System.out.println("Printing all no using varags : -  ");
		
		//printing all  elements
		//enhanced array
		for(int i:demoArray)
		{
			//print
			System.out.print(i+"   ");
		}
		
	}//end of method allNo
	
	//declaring the method allNo
	//for printing even no
	//for printing odd no
	//for printing sum of even & odd no
	static void evenOdd(int ...demoArray)
	{
		int evenSum=0;//declaring varieable for even no sum
		int oddSum=0;//declaring varieable for odd no sum
		
		System.out.println("\nPrinting even no using varags : - \n ");//print
		//printing all even element
		//enhanced array
		for(int i:demoArray)
		{
			//checking whether even or not
			if((i%2)==0)
			{
				//increasing the value of even sum by adding even element
				evenSum+=i;
				
				//print
				System.out.print(i+"   ");
			}//end
		}//end of for loop
		
		//print
		System.out.println("\nSum of this  even no using varags --> "+evenSum+"\n");
		
		
		System.out.println("\nPrinting odd no using varags : - \n ");
		//printing all odd element
		//enhanced array
		for(int i:demoArray)
		{
			//checking whether odd or not
			if((i%2)!=0)
			{
				//increasing the value of odd sum by adding odd element
				oddSum+=i;
				//printing
				System.out.print(i+"   ");
			}//end 
		}//end of for loop
		
		//print
		System.out.println("\nSum of this  odd no using varags --> "+oddSum+"\n");
		
	}//end of method evenOdd
	
	//decalaring main method
	public static void main(String... args)
	{
		//calling allNo function
		//passing set of integer elemnent
		//varags
		allNo(7,8,98,55,87,7,2,1,56,88,97,103);
		
		//calling ev\ function
		//passing set of integer elemnent
		//varags
		evenOdd(7,8,98,55,87,7,2,1,56,88,97,103);
	}//end of main class
}//end of class VaragsEvenOdd