package myjava;
import java.util.*;
interface Pet
{
public String getName();
public void setName(String n);
public void play();
}
abstract class Animal
{
int leg;
Animal(int l)
{
leg=l;
}
void walk()
{
System.out.println("This animal walk by "+leg+"legs");
}

abstract void eat();

}
class Spider extends Animal
{

void eat()
{
System.out.println("Spider eat insects");
//super.walk();
}
Spider(int l)
{
super(8);
}


}
class Fish extends Animal implements Pet
{
String name;
Fish(int l)
{
super(0);
}


public String  getName()
{
return name;
}
public void setName(String n)
{
name=n;
// System.out.println("This fish's name is "+name);

}
void eat()
{
System.out.println("Fish eats plants");
    }
public void play()
{
System.out.println("Fish plays in water");
}
void walk()
{
super.walk();
}

}

//CAT
class Cat extends Animal implements Pet
{
String name;
Cat(int l)
{
super(4);
}


public String  getName()
{
return name;
}
public void setName(String n)
{
name=n;
// System.out.println("This fish's name is "+name);

}
void eat()
{
System.out.println("Cat eats fish");
    }

void walk()
{
super.walk();
}

}
public class INTERINHERIT
{
public static void main(String args[])
{
Scanner i=new Scanner(System.in);

Spider s=new Spider(8);
Cat c=new Cat(4);
Fish f=new Fish(0);
//fish
System.out.println("FISH");
f.setName("MIMI");
System.out.println("This fish's name is "+f.getName());
f.eat();
f.walk();
f.setName("MOMO");
System.out.println("This fish's name is "+f.getName());
//cat
System.out.println("CAT");
c.setName("FLUFFY");
System.out.println("This cat's name is "+c.getName());
c.eat();
c.walk();
c.setName("MOOSE");
System.out.println("This cat's name is "+c.getName());
//spider
System.out.println("SPIDER");
s.eat();
s.walk();
}

}
