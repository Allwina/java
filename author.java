package myjava;
import java.util.*;
public class author {
	String fname,lname;
	public author (String firstName, String lastName)
	{
		fname=firstName;
		lname=lastName;
	}
		public void setFirstName (String firstName)
		{
			fname=firstName;
			
		}
		public void setLastName (String lastName)
		{
			lname=lastName;
		}
		public String getFirstName()
		{
			return fname;
		}
		public String getLastName()
		{
			return lname;
		}
		public String toString()
		{
			return(fname+" "+lname);
		}
		
	}
class book
{
	String title;
   String author;
    double price;
    public book (String title, String author, double price)
    {
    	this.title=title;
    	this.author=author;
    	this.price=price;
    }
    public void setTitle(String title) {
    	this.title=title;
    }
    public void setAuthor(String author)
    {
    	this.author=author;
    }
    public void setPrice(double price) {
    	this.price=price;
    	
    }
    public String getTitle()
    {
    	return title;
    }
    public String getAuthor()
    {
    	return author;
    }
    public String toString()
    {
    	return ("Title: "+this.title+"|| Author: "+this.author +"|| Price: "+ this.price);
    }

}

public class  Demo
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		String fn,ln;
		
		author ob=new author("Russel" , " Winderand");
		book o=new book("Developing Java Software" ,"Russel Winderland", 79.95);
		
	}
}