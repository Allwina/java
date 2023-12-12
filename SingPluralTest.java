package myjava;
import java.util.*;
import java.io.*;
public class SingPluralTest {
public static void main(String args[]){

		ArrayList<String> allWords = new ArrayList<String>();
		Scanner input = new Scanner(new File("input.txt"));
		while (input.hasNext())
		{
			String word = input.next();
			allWords.add(word);
			}
			System.out.println(allWords);
			System.out.println("List in Reverse order");
			 for (int i = allWords.size() - 1; i >= 0; i--) 
			 { 
	           System.out.print(allWords.get(i)+" ");
			 }	      
			 }
}