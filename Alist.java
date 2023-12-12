package myjava;
import java.util.*;
import java.util.List;
public class Alist
{
	public static void main(String args[])
	{
		
	ArrayList<Integer> a = new ArrayList<Integer>(); //Declaring ArrayList
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(0, 5);
        a.add(3, 30);
        //Scanner scanner = new Scanner(System.in);
        System.out.println("List: "+a);
        
      /*  int num = scanner.nextInt();
        System.out.println("Enter the number to add into the List: ");*/
        ArrayList<String> animals = new ArrayList<>();
        // Add elements
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");

        System.out.println("ArrayList: " + animals);
		
	}

}
