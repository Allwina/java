package myjava;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class TrafficLight extends JPanel implements ActionListener
{
JRadioButton r1,r2,r3;
Color red_c,yellow_c,green_c;
ButtonGroup gp;
//JPanel p;
TrafficLight()
{
setBounds(0,0,640,480);
//p=new JPanel();
r1=new JRadioButton("red");
r2=new JRadioButton("yellow");
r3=new JRadioButton("green");
r1.setSelected(true);
red_c=Color.red;
yellow_c=getBackground();
green_c=getBackground();

 gp=new ButtonGroup();
gp.add(r1);
gp.add(r2);
gp.add(r3);
//p.add(gp);
add(r1);
add(r2);
add(r3);
r1.addActionListener(this);
r2.addActionListener(this);
r3.addActionListener(this);

}

public void paintComponent(Graphics g)
{
super.paintComponent(g);
g.drawOval(50,50,50,50);
g.drawOval(50,110,50,50);
g.drawOval(50,170,50,50);
g.setColor(red_c);
g.fillOval(50,50,50,50);
g.setColor(yellow_c);
g.fillOval(50,110,50,50);
g.setColor(green_c);
g.fillOval(50,170,50,50);

}
public void actionPerformed(ActionEvent e)
{
if(r1.isSelected()==true)
{
red_c=Color.red;
yellow_c=getBackground();
green_c=getBackground();
}
if(r2.isSelected()==true)
{
red_c=getBackground();
yellow_c=Color.yellow;
green_c=getBackground();
}
if(r3.isSelected()==true)
{
red_c=getBackground();
yellow_c=getBackground();
green_c=Color.green;
}

repaint();
}
public static void main(String args[])
{
JFrame f=new JFrame("Traffic Lights");
// f.setContentPane();
f.setSize(640,480);
f.setVisible(true);
f.setLayout(null);
TrafficLight t =new TrafficLight();
f.add(t);
}

}

