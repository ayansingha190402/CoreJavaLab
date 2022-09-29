/* Program :Write a program to show aggregation 
of a book and author class
@Part - 2 - Book.java
@author: Ayan Singha
@Date : 29 Sep 2022
@Lab Assesment by Shuruti Singhal Mam 
@Version: 1
*/

//declaring the class Book
public class Book {
	
	//declaring private varieable outside any method
	private int bookId;
	private String bookName;
	private Author author;
	
	//non - parameterised constructer 
	public Book() {
		super();// as object is super class
	}
	
	//parameterised constructer 
	//parameters - bookId, bookName & author
	//here we can see author is object of Author class
	// class Book has A -   Has a - class Autjor
	public Book(int bookId,String bookName,Author author) {
		this.bookId=bookId;
		this.bookName=bookName;
		this.author=author;
	}
	//declaring the method showDetail
	//to displat detilas of book & author
	public void showDetail()
	{
	  System.out.println("Book ID -->"+bookId); //print
	  System.out.println("Book Name -->"+bookName);//print
	  System.out.println("Author is --> "+author.getAuthorName());//print
	  System.out.println("Author Age is -->"+author.getAuthorAge());//print
	}//end

}//end of class Book