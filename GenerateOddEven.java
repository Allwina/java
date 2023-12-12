package myjava;
class OddNumbers extends Thread{
	public void run(){   
		for(int i=1;i<=100;i+=2) {
			System.out.println("Odd Number Generated"+i);
		}
	}
}
class EvenNumbers extends Thread{
	public void run(){   
		for(int i=1;i<=100;i+=2) {
			System.out.println("Even Number Generated"+i);
		}
	}
}
public class GenerateOddEven {
	public static void main(String[] args) {
		OddNumbers oddNumbers = new OddNumbers();
		EvenNumbers evenNumbers = new EvenNumbers();
		oddNumbers.setPriority(Thread.MAX_PRIORITY);
       
        evenNumbers.setPriority(Thread.MIN_PRIORITY);

		oddNumbers.start();
		evenNumbers.start();
	}

}
