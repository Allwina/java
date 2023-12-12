package myjava;


public class ThreadP extends Thread{
	public void run(){  
		   System.out.println("running thread name is:"+Thread.currentThread().getName()+" and priority is:"+Thread.currentThread().getPriority());  
		  
		  }  
		 public static void main(String args[]){  
			 ThreadP firstThread =new ThreadP();  
			 ThreadP secondThread=new ThreadP(); 
			 firstThread.setName("First Thread");
			 secondThread.setName("Second Thread");
			 firstThread.setPriority(Thread.MIN_PRIORITY);  
			 secondThread.setPriority(Thread.MAX_PRIORITY);  
			 firstThread.start();  
			 secondThread.start();  
		   
		 }  

}