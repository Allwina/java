package myjava;
import java.util.*;
class Bas
{
	public String name,at;
	public int an,bal;
Scanner in=new Scanner(System.in);
public void getdetails()
{
	System .out.println("Enter Account holder's name  : ");
	name=in.nextLine();
	System .out.println("Enter Account number : ");
	an=in.nextInt();
	System .out.println("Enter Account type:  : ");
	at=in.next();
	System .out.println("Enter balance:  : ");
	bal=in.nextInt();
}

public void display()
{
    
	
System.out.println("Name of account holder:"+name+ "\n Account no.:"+an + "\n Account type: "+at+ "\n Balance:"+bal);


}
void search()
{

}

void deposit(int h)
{
bal=bal+h;


   }
void withdraw(int w)
{
bal=bal-w;
}
void exit()
{
System.out.println("Exiting");

}
}
public class Ban 

{
public static void main(String args[])
{
Scanner in =new Scanner(System.in);
Bas ob=new Bas();
System.out.println("How many number of customers do you want to input?");
int n=in.nextInt();
Bas C[] = new Bas[n];  
for (int i = 0; i < C.length; i++) {  
    C[i] = new Bas();  
    C[i].getdetails();  
}  

int k;
{
do
{
System.out.println("enter 1.Display all account details  2.Search by account number 3.Deposit the amount  4.Withdraw the amount 5.Exit ");
k=in.nextInt();

switch(k)
{
case 1:
{
	for (int i = 0; i < C.length; i++) {  
        C[i].display();  
    }  
	
break;
}
case 2:
{
	System.out.println("enter the account number");
	int ac=in.nextInt();
	for (int i = 0; i < C.length; i++) { 
		if(C[i].an==ac)
		{
        C[i].display();  
    } 
		
	}
 break;
}
case 3:
{
	System.out.println("enter the account number");
	int ac=in.nextInt();
	for (int i = 0; i < C.length; i++)
	{ 
		if(C[i].an==ac)
		{
			try
			{
				System.out.println("Enter the amount to be deposited");
				int d=in.nextInt();
				if(d<=0)
				{
					throw new Exception ("InvalidAmountException");
				}
				C[i].deposit(d);
			}
			catch(Exception e)
			{
				System.out.println("Exception thrown"+e);
			}
       
        } 
		
	}
	

break;
}
case 4:
{
	System.out.println("enter the account number");
	int ac=in.nextInt();
	for (int i = 0; i < C.length; i++) { 
		if(C[i].an==ac)
		{
			try
			{
			    System.out.println("Enter the amount to be withdrawed");
				int W=in.nextInt();
				if(W<=0)
				{
					throw new Exception ("InvalidAmountException");
				}
				if(W>C[i].bal)
				{
					throw new Exception ("InsufficientFundsException");
				}
			    C[i].withdraw(W);
			}
			catch(Exception e)
			{
				System.out.println("Exception thrown"+e);
			}
			
			
       
    } 
		
	}
	

	
  break;
}
case 5:
{
ob.exit();
 break;
}
}
}while(k<5);

}

}
}










