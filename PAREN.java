package myjava;
abstract  class parent {
	abstract void message();
}
class A extends parent
{
	void message()
	{
		System.out.println("This is the first subclass");
	}
}
class B extends parent
{
	void message()
	{
		System.out.println("This is the Second subclass");
	}
}
public class PAREN {
	public static void main(String args[])
	{
		A a=new A();
		B b=new B();
		a.message();
		b.message();
	}

}
