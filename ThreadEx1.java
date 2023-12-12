package myjava;


class MyThread1 extends Thread {
String name;
MyThread1(String tname)
{
name=tname;
}
 public void run() {
    for(int i=0;i<5;i++)
            {System.out.println("thread "+name+" with i="+i+ " is running ... ");
            }
  }}  
class ThreadEx1
{
public static void main(String [] args  )
	{
MyThread1 t = new MyThread1("One");
 t.start();
 MyThread1 t1 = new MyThread1("Two");
 t1.start();
 }
	}