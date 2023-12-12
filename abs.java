package myjava;
import java.util.*;
abstract class Bank
{
	abstract void getBalance();
	
}
class BankA extends Bank
{
	void getBalance()
	{
		System.out.println("Bank A $100");
	}
	
}
class BankB extends Bank
{
	void getBalance()
	{
		System.out.println("Bank B $150");
	}
	
}
class BankC extends Bank
{
	void getBalance()
	{
		System.out.println("Bank C $200");
	}
	
}

public class abs
{
	public static void main(String args[])
	{
		
	
	Scanner in=new Scanner(System.in);
	BankA a=new BankA();
	BankB b=new BankB();
	BankC c=new BankC();
	a.getBalance();
	b.getBalance();
	c.getBalance();
	
	}

}
