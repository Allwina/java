package myjava;


import javax.swing.*;
import java.awt.event.*;
class roof implements ActionListener
{
JFrame f;
JTextField t;
JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15;
roof()
{
f=new JFrame("Calculator");
t=new JTextField();
b1=new JButton("1");
b2=new JButton("2");
b3=new JButton("3");
b4=new JButton("4");
b5=new JButton("5");
b6=new JButton("6");
b7=new JButton("7");
b8=new JButton("8");
b9=new JButton("9");
b0=new JButton("0");
b10=new JButton("/");
b11=new JButton("*");
b12=new JButton("-");
b13=new JButton("+");
b14=new JButton(".");
b15=new JButton("=");
t.setBounds(100,100,200,30);
b7.setBounds(100,140,50,30);
b8.setBounds(150,140,50,30);
b9.setBounds(200,140,50,30);
b10.setBounds(250,140,50,30);
b4.setBounds(100,170,50,30);
b5.setBounds(150,170,50,30);
b6.setBounds(200,170,50,30);
b11.setBounds(250,170,50,30);
b1.setBounds(100,200,50,30);
b2.setBounds(150,200,50,30);
b3.setBounds(200,200,50,30);
b12.setBounds(250,200,50,40);
b13.setBounds(100,230,50,30);
b0.setBounds(150,230,50,30);
b14.setBounds(200,230,50,30);
b15.setBounds(250,230,50,30);
f.add(t);
f.add(b7);
f.add(b8);
f.add(b9);
f.add(b10);
f.add(b4);
f.add(b5);
f.add(b6);
f.add(b11);
f.add(b1);
f.add(b2);
f.add(b3);
f.add(b12);
f.add(b13);
f.add(b0);
f.add(b15);
f.add(b14);
f.setLayout(null);
f.setVisible(true);
f.setSize(350,500);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setResizable(false);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b0.addActionListener(this);
b14.addActionListener(this);
b10.addActionListener(this);
b11.addActionListener(this);
b12.addActionListener(this);
b13.addActionListener(this);
b15.addActionListener(this);


}
 
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
t.setText(t.getText()+"1");
if(e.getSource()==b2)
t.setText(t.getText()+"2");
if(e.getSource()==b3)
t.setText(t.getText()+"3");
if(e.getSource()==b4)
t.setText(t.getText()+"4");
if(e.getSource()==b5)
t.setText(t.getText()+"5");
if(e.getSource()==b6)
t.setText(t.getText()+"6");
if(e.getSource()==b7)
t.setText(t.getText()+"7");
if(e.getSource()==b8)
t.setText(t.getText()+"8");
if(e.getSource()==b9)
t.setText(t.getText()+"9");
if(e.getSource()==b0)
t.setText(t.getText()+"0");
if(e.getSource()==b14)
t.setText(t.getText()+".");


}
public static void main(String[]args)
{
new roof();
}
}