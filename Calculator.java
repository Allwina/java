package myjava;
import javax.swing.*;

import java.awt.event.*;
public class Calculator  implements ActionListener
{
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
JTextField t;
JFrame f;
static double a=0,b=0,result=0;
static int operator=0;
Calculator()
{
 f=new JFrame("Calculator");
f.setLayout(null);
t= new JTextField();
t.setBounds(100,100,200,30);
b1=new JButton("0");
b1.setBounds(100,140,50,30);
b2=new JButton("1");
b2.setBounds(150,140,50,30);
 b3=new JButton("2");
b3.setBounds(200,140,50,30);
b4=new JButton("+");
b4.setBounds(250,140,50,30);
b5=new JButton("3");
b5.setBounds(100,170,50,30);
b6=new JButton("4");
b6.setBounds(150,170,50,30);
b7=new JButton("5");
b7.setBounds(200,170,50,30);
b8=new JButton("-");
b8.setBounds(250,170,50,30);
b9=new JButton("6");
b9.setBounds(100,200,50,30);
b10=new JButton("7");
b10.setBounds(150,200,50,30);
 b11=new JButton("8");
b11.setBounds(200,200,50,30);
 b12=new JButton("*");
b12.setBounds(250,200,50,30);

 b13=new JButton("9");
b13.setBounds(100,230,50,30);
b14=new JButton("/");
b14.setBounds(150,230,50,30);
b15=new JButton("%");
b15.setBounds(200,230,50,30);
 b16=new JButton("=");
b16.setBounds(250,230,50,30);
f.add(t);
f.add(b1);f.add(b2); f.add(b3); f.add(b4);
f.add(b5);f.add(b6); f.add(b7); f.add(b8);
f.add(b9);f.add(b10);f.add(b11);f.add(b12);
f.add(b13);f.add(b14);f.add(b15);f.add(b16);
f.setSize(640,480);
f.setVisible(true);
     
         b1.addActionListener(this);b2.addActionListener(this);
         b3.addActionListener(this);b4.addActionListener(this);
         b5.addActionListener(this);b6.addActionListener(this);
         b7.addActionListener(this);b8.addActionListener(this);
         b9.addActionListener(this);b10.addActionListener(this);
         b11.addActionListener(this);b12.addActionListener(this);
         b13.addActionListener(this);b14.addActionListener(this);
         b15.addActionListener(this);b16.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
 

		if(e.getSource()==b1)
	{
	   t.setText(t.getText()+("0"));
	}
	
		if(e.getSource()==(b2))
	{
	       t.setText(t.getText()+("1"));
	}
	
	
		if(e.getSource()==(b3))
	{
	   t.setText(t.getText()+"2");
	}
	
		if(e.getSource()==(b5))
	{
	t.setText(t.getText()+"3");
	}
	
		if(e.getSource()==(b6))
	{
	   t.setText(t.getText()+"4");
	}
	
		if(e.getSource()==(b7))
	{
	   t.setText(t.getText()+"5");
	}
	
		if(e.getSource()==(b9))
	{
	   t.setText(t.getText()+"6");
	}
	
		if(e.getSource()==(b10))
	{
	   t.setText(t.getText()+"7");
	}
	
		if(e.getSource()==(b11))
	{
	   t.setText(t.getText()+"8");
	}
	
		if(e.getSource()==(b13)) {
	   t.setText(t.getText()+"9");
	}
		if(e.getSource()==b4)
		{
		a=Double.parseDouble(t.getText());
		operator=1;
		t.setText("");
		}
		if(e.getSource()==b8)
		{
		a=Double.parseDouble(t.getText());
		t.setText("");
		operator=2;
		
		}
		if(e.getSource()==b12)
		{
		a=Double.parseDouble(t.getText());
		t.setText("");
		operator=3;
		
		}
		if(e.getSource()==b14)
		{
		a=Double.parseDouble(t.getText());
		operator=4;
		t.setText("");
		}
		if(e.getSource()==b15)
		{
		a=Double.parseDouble(t.getText());
		operator=5;
		t.setText("");
		}
		if(e.getSource()==b16)
		{
		b=Double.parseDouble(t.getText());
		switch(operator)
		{
		case 1: result=a+b;
		break;
		case 2: result=a-b;
		break;
		case 3: result=a*b;
		break;
		case 4: result=a/b;
		break;
		case 5:result=a%b;
		break;
		default: result=0;
		}
		t.setText(""+result);
		}
}
public static void main(String[] args) {

new Calculator();

}

}
