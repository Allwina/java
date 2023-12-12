package myjava;
import java.util.*;
import java.io.*;
public class MyFile {
	public static void main(String args[])throws IOException
	{
	Scanner sc=new Scanner(System.in);
	//File f=new File("MyFile.txt");
	//f.createNewFile();
	String s="This is the University Exam for OODP. \n This is a program to illustrate the use of files.";
    FileWriter w=new FileWriter("MyFile.txt",true);
   
    w.write(s);
    w.close();
}
}
