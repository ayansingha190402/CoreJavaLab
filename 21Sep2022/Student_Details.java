/* Program :  Write a Student and create an array of 10 students and display the students whose marks are more than 90%.	
@author: Ayan Singha
@Lab Assesment by: Shruti Singhal Mam 
@Date : 21 Sep 2022
@Version: 1.0
*/

 //starting of class Student_Details
class Student_Details {
 
    // dfeaclaring main method 
	public static void main(String... args)
    {
 
			student_Details();
			student_Details();
    }
	// end of main method 
	
	// declaring the method student_Details
	static  void  student_Details()
	{
		// Declaring an array of student
        Student[] arr;
 
        // Allocating memory for 2 objects
        // of type student
        arr = new Student[10];
 
        // Initializing the first element
        // of the array
        arr[0] = new Student(1, "Ayan", 92);
		
 
        // Initializing the second element
        // of the array
        arr[1] = new Student(2, "Subhadip", 94);
		
		// Initializing the third element
        // of the array
        arr[2] = new Student(3, "Jayanta",95);
 
        // Initializing the fourth element
        // of the array
        arr[3] = new Student(4, "Uday",90);
		
		
		// Initializing the fivth element
        // of the array
        arr[4] = new Student(5, "Kaif",88);
 
        // Initializing the sixth element
        // of the array
        arr[5] = new Student(6, "Himanshu",80);
		
		// Initializing the seventh element
        // of the array
        arr[6] = new Student(7, "Pradip",91);
 
        // Initializing the eighth element
        // of the array
        arr[7] = new Student(8, "Avik",80);
		
		// Initializing the nineth element
        // of the array
        arr[8] = new Student(9, "Shilpa",85);
 
        // Initializing the tenth element
        // of the array
        arr[9] = new Student(10, "Soumendu",98);
		
		//--------------------------------------------------------------//
		
		int maxMarks=0;
		int student=0;
		
		// Displaying all the student data through for loop
		//starting of for loop
		for(int i=0;i<10;i++)
		{
			//printing student details using 
			//display method class student  
			arr[i].display();

		}// end of for loop
		
		//----------------------------------------------------------------------//
		
		System.out.println("Student having higher than 90% \n\n ");
		// Displaying all the student data whose marks>90
		//staring of for loop 
		for(int i=0;i<10;i++)
		{
			//printing student details using 
			//display method class student 
			if(arr[i].marks>90)
			{
				//displaying student details
				arr[i].display();
			}
			

		}// end of for loop
		
	}//end of method student_Details
}// end of class Student_Details
 
// Creating a student class with
// id , name and marks  as a attributes
class Student {
 
    //declaring varieables
	public int id;
    public String name;
	public int marks;
 
    // Student class constructor -parameterised constructer
    Student(int id, String name, int marks)
    {
        this.id = id;
        this.name = name;
		this.marks = marks;
    }
 
    // display() method to display
    // the student data
    public void display()
    {
        System.out.println("Student Id is: " + id + " "+"\n"
                           + "Student Name is: "
                           + name+"\nPercentage Obtained:"+marks);
        System.out.println();
    }// end of method display 
}// end of student class 