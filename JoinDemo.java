package myjava;
class A1 extends Thread
{ 
	public void run() 
    { 
        for (int i = 1; i <= 10; i++) { 
            try 
				{ System.out.print(i + " "); 
				 Thread.sleep(1000); 
            } 
            catch (Exception e) { 
                System.out.println(e); 
            } 
            
        } 
    } 
} 
class B1 extends Thread { 
	  
    public void run() 
    { 
    for (char i = 'a'; i <= 'k'; i++) { 
        try {
        System.out.print(i + " ");
           // Thread.sleep(1000);
        } 
        catch (Exception e) { 
            System.out.println(e); 
        } 
         
    } 
} 
} 
public class JoinDemo {

}
