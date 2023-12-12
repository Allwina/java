package myjava;
import java.util.*;
class Table
{    synchronized void printTable(int n)
      {  
       for(int i=1;i<=5;i++)
        {  
         System.out.println(n+"*"+i+"="+n*i);  
         try
	{  
         Thread.sleep(400);  
         }
         catch(Exception e)
         {
        	 System.out.println(e);
	}  
       }  
      }//end of the method  
 }  
class Thread1 extends Thread
{  Table t;
   int e;
   Thread1(int a,Table t)
   {  
       e=a;
       this.t=t;
       }  
    public void run()
   {  
	  
       t.printTable(e);  
   }       
}
public class MulThreadSyncDemo {
public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		 Table obj = new Table();//only one object  
		System.out.println("Enter the table you want to run by Thread 1") ;
		  int one=in.nextInt();
		System.out.println("Enter the table you want to run by Thread 2") ;
		  int two=in.nextInt();
		  System.out.println("Enter the table you want to run by Thread 2") ;
		  int three=in.nextInt();
		 Thread1 t1=new    Thread1(one,obj); 
		 Thread1 t2=new    Thread1(two,obj); 
		 Thread1 t3=new    Thread1(three,obj); 
		  t1.start(); 
		  t2.start();
		  t3.start();
		  

	}

}