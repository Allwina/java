package myjava;

import java.util.*;
class BS
{

String at="SB",name="Allwina";
int an=123;
int bal=1000;
void display()
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
public class Bank
{
public static void main(String args[])
{
Scanner in =new Scanner(System.in);
BS ob=new BS();
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
ob.display();
break;
}
case 2:
{
ob.search();
              break;
}
case 3:
{

ob.deposit(500);
break;
}
case 4:
{
ob.withdraw(500);
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
/*public class InvalidamountException extends Exception
{
}*/







