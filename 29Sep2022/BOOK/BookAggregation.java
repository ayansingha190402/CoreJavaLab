/* Program :Write a program to show aggregation 
of a book and author class
@Part - 3 - BookAggregation.java
@author: Ayan Singha
@Date : 29 Sep 2022
@Lab Assesment by Shuruti Singhal Mam 
@Version: 1
*/

//declaring the class BookAggregation
class BookAggregation
{	
	//declaring the method bookDetails
	public static void bookDetails() {
		
		//creating a object of Author class
		//and initialising the value
		Author author=new Author("H. C. VERMA",70);
		
		//creating a object of Author Book
		//and initialising the value
		Book book=new Book(1,"Concept of Physics",author);
		
		//calling the function showDetail of Book class
		book.showDetail();
	}//end
	
	//declaring main method 
	public static void main(String... args) {
		
		//calling the function bookDetails
		bookDetails();
	}//end
}// end of class BookAggregation