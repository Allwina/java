package myjava;
import javax.swing.*;
public class SwingD {
	 public static void main(String[] args) {
	JFrame f= new JFrame("my frame");
	f.setTitle("my new frame title");
	JPanel p=new JPanel();
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
	JRadioButton r1=new JRadioButton("Male");    
    JRadioButton r2=new JRadioButton("Female");    
    r1.setBounds(35,280,100,30);    
    r2.setBounds(35,300,100,30);    
    ButtonGroup bg=new ButtonGroup();    
    bg.add(r1);bg.add(r2);    
    p.add(r1);p.add(r2);
	JPasswordField pf = new JPasswordField("My pass field");   
    pf.setBounds(300,65,100,30);
    p.add(pf);
     JTextArea area=new JTextArea("My Text Area");  
      area.setBounds(250,160, 200,200);  
      p.add(area);
	 }
}

