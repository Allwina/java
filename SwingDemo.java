package myjava;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class SwingDemo {
	public static void main(String args[])
	{
JFrame f=new JFrame("FRAME");
//f.setTitle("NEW FRAME");
JPanel p =new JPanel();

f.setContentPane(p);
f.setSize(300,350);
f.setLayout(null);
f.setVisible(true);
JLabel l=new JLabel("My Label");  
l.setBounds(20,100, 100,20); 
p.add(l);
JButton b = new JButton("My press me Button");
b.setBounds(50,50,150, 40);   
p.add(b);

JButton b1=new JButton(new ImageIcon("D:\\icon.png"));    
b1.setBounds(100,100,100, 40);    
p.add(b1);    

JTextField tf=new JTextField("My Text Field");
tf.setBounds(230,100,100, 40);    
p.add(tf);

JPasswordField pf = new JPasswordField("My pass field");   
pf.setBounds(300,65,100,30);
p.add(pf);
 JTextArea area=new JTextArea("My Text Area");  
  area.setBounds(250,160, 200,200);  
  p.add(area);
 
}
}

