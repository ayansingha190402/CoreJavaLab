/* Program : Sort element of array , identify duplicate
element and remove them
@author: Ayan Singha
@Lab Assesment by: Shruti Singhal Mam 
@Date : 21 Sep 2022
@Version: 1.0
*/

 // importing util pacakge for scanner class
import java.util.Scanner;

//starting of class RemoveDuplicateElement
class RemoveDuplicateElement

{
	
	// staring of method inputArrey
	static int[] inputArrey()
	{	
		//creating object for scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking input for size of array
		System.out.println("\nEnter size of Arrey");
		int size=sc.nextInt();
		
		//creating an array 
		int newArrey[]= new int[size];
		
		//start of for loop
		for(int i=0;i<size;i++)
		{
			System.out.println("myArrey["+i+"] ->");
			//taking input of the element of the arrey
			newArrey[i]=sc.nextInt();
			
			
		}
		//return arrar to main method
		return newArrey;
		
	}
	// end of method inputArrey


	
	// staring of method displayArrey
	static void displayArrey(int myArrey[])
	{
		// creating integer varieable
		int x=0;
		System.out.println("\n\nDisplaying elements  ->");
		
		//starting of for loop
		for(int i: myArrey)
		{
			//printing arrey lement values
			System.out.println("myArrey["+x+"] ->"+i);
			x++; // increamenting values
				
		}
	}
	// end of method displayArrey
	
	// staring of method sortArrayElement
	static int[] sortArrayElement(int myArrey[])
    {
	   // creating a deep copy for our use
	   int deepCloneArray[] = myArrey.clone(); 
	   
	   // creating integer varieable
	   int temp;
	   
	   //starting of outer for loop 
	   for(int i=0;i<myArrey.length;i++)
	   {
		   //starting of outer for loop 
		   for(int j=i+1;j<myArrey.length;j++)
		   {
			   if(myArrey[i]>myArrey[j])
			   {
				   //swaping the values 
				   temp = myArrey[i];
				   myArrey[i]=myArrey[j];
				   myArrey[j]=temp;
			   }
			   
		   }
	   }
	   
	   //printing arrey before shorting
	   System.out.println("\nArray before sorting -->");
	   displayArrey(deepCloneArray);
		
	   //printing arrey before shorting
	   System.out.println("\nArray after sorting -->");
	   displayArrey(myArrey);
	   
	   //returning aaray after shorting to main method 
	   return myArrey;
	}
	
 
	
	// declaring the method removeDuplicatesElement.
   static int removeDuplicates(int arr[], int n)
    {
        // Return, if array is empty or contains a single
        // element
        if (n == 0 || n == 1)
            return n;
 
        int[] temp = new int[n];
 
        // Start traversing elements
        int j = 0;
        for (int i = 0; i < n - 1; i++)
            // If current element is not equal to next
            // element then store that current element
            if (arr[i] != arr[i + 1])
                temp[j++] = arr[i];
 
        // Store the last element as whether it is unique or
        // repeated, it hasn't stored previously
        temp[j++] = arr[n - 1];
 
        // Modify original array
        for (int i = 0; i < j; i++)
            arr[i] = temp[i];
 
        System.out.println("\nArrey AFter removing duplicate - ");
		displayArrey(arr);
		return j;
    }
	//end of method removeDuplicates
 
    // staring of main method 
	public static void main(String... args)
	{
		int myArrey[] =inputArrey();
		int newArrey[] =sortArrayElement(myArrey);
		int n = removeDuplicates(myArrey, myArrey.length);
 
	}
	// end of main method 
}
//end of class RemoveDuplicateElement