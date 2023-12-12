package myjava;
import java.awt.*;
import java.awt.event.*;

public class MouseLab extends Frame implements MouseListener,MouseMotionListener{
		 
	public MouseLab()
	{
		//setting frame
		   setSize(400,400);
	 	   setVisible(true);
		//close button
	   	addWindowListener(new WindowAdapter() {
	        public void windowClosing(WindowEvent we) {
	          System.exit(0);
	        }
	     	});
		//registering sourse and listener
		
		addMouseListener(this);
		addMouseMotionListener(this);
	}
public void mousePressed(MouseEvent e){
	setBackground(Color.red);
	setTitle("MOUSE PRESSED");
	
	
		
	}
	public void mouseReleased(MouseEvent e){
		setBackground(Color.green);
		setTitle("MOUSE RELEASED");
		
		
		
	
	}
	public void mouseClicked(MouseEvent e){
		
		setBackground(Color.yellow);
		setTitle("MOUSE Clicked");
		
		
	
	}
	public void mouseEntered(MouseEvent e)
	{
		setBackground(Color.pink);
		setTitle("MOUSE Entered");   
	}
	public void mouseExited(MouseEvent e)
	{
		setBackground(Color.blue);
		setTitle("MOUSE Exited");
		
	}
	public void mouseMoved(MouseEvent e)
	{
		Graphics graphics =getGraphics();
		setBackground(Color.orange);
		String txt="Hi,My mouse is moved";
		setTitle("MOUSE Moved");
		graphics.fillOval(e.getX(),e.getY(),5,5);
		
		
	
	}
	public void mouseDragged(MouseEvent e)
	{
		setBackground(Color.white);
		 Graphics graphics = getGraphics();
	        String txt = "Hi, my string is being dragged";
	        graphics.drawString(txt,e.getX(),e.getY());
	        setTitle("Mouse dragged");
	}
	public static void main(String args[]){
	     new MouseLab();
	}

}
