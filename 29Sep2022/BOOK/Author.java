/* Program :Write a program to show aggregation 
of a book and author class
@Part - 1 - Author.java
@author: Ayan Singha
@Date : 29 Sep 2022
@Lab Assesment by Shuruti Singhal Mam 
@Version: 1
*/

//declring the class Author
public class Author {
	
	//declaring private varieable outside any method
	private String authorName;
	private int authorAge;
	
	
	//non - parameterised constructer 
	public Author() {
		super(); // as object is super class

	}
	
	//parameterised constructer 
	//parameters - authorName & authorAge
	public Author(String authorName,int authorAge) {
		super();
		this.authorName=authorName;
		this.authorAge=authorAge;
	}//end
	
	//getter method for authorName 
	public String getAuthorName() {
		return authorName;
	}//end
	
	
	//setter method for authorName 
	public void setAuthorName(String authorName) {
		this.authorName = authorName ;
	}//end
	
	
	//getter method for authorAge 
	public int getAuthorAge() {
		return authorAge;
	}//end
	
	
	//setter method for authorAge 
	public void setAuthorAge(int authorage) {
		this.authorAge = authorAge;
	}//end
}//end of class Author