package myjava;


class OddNumberThread implements Runnable{
	public void run(){
		// Displaying the thread that is running
		for(int i=2;i<20;i+=2){
			System.out.println("Odd Number Generated"+i);
		} 
   } 
} 
class EvenNumberThread implements Runnable{
	public void run(){
		// Displaying the thread that is running 
        for(int i=1;i<20;i+=2){
        	System.out.println("Even Number Generated"+i);
        }
    } 
} 

public class MultiThread {
	public static void main(String[] args) {
		OddNumberThread oddnumberThread = new OddNumberThread();
		EvenNumberThread evenNumberThread = new EvenNumberThread();
		Thread oddThread = new Thread(oddnumberThread);
		Thread evenThread = new Thread(evenNumberThread);
		oddThread.start();
		evenThread.start();
	}

}
