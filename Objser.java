package myjava;


import java.io.*;
class Person implements Serializable

{
	int age;
	String name;
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}

	public void display()
	{
		System.out.println("name="+name+"  age="+age);
	}
}
public class Objser {
	public static void main(String args[])
	{
		Person p=new Person("allwina",20);
		
			try
			{
		
		//p.display();
		FileOutputStream f1=new FileOutputStream("person.dat");
		ObjectOutputStream obj=new ObjectOutputStream(f1);
		obj.writeObject(p);
		f1.close();
		System.out.println("object serialized");
		}
			catch(IOException e)
			{
				System.out.println(e.getMessage());
			}
			try
			{
		
		//p.display();
		FileInputStream fin=new FileInputStream("person.dat");
		ObjectInputStream obj=new ObjectInputStream(fin);
		Person p1=(Person)obj.readObject();
		//obj.writeObject(p);
		p1.display();
		fin.close();
		
		}
			catch(IOException e)
			{
				System.out.println(e.getMessage());
			}
			catch(ClassNotFoundException e)
			{
				System.out.println(e.getMessage());
			}
		
	}


}
