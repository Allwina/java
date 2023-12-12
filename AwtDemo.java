package myjava;
import java.awt.*;
import java.awt.event.*;
public class AwtDemo {
	public static void main(String args[])
	{
			Frame f = new Frame("My Frame title");
			f.setTitle("My new Frame title");
			
			    Label l=new Label("My Label");  
		        l.setBounds(20,100, 100,20); 
		        f.add(l);
		        //add button
		        Button b = new Button("My press me Button");
				b.setBounds(50,50,150, 40);   
				f.add(b);
				//add textfield
				TextField tf=new TextField("My Text Field");
				tf.setBounds(230,100,100, 40);    
				f.add(tf);
				//add text area
				TextArea area=new TextArea("My Text Area");  
			    area.setBounds(250,160, 200,200);  
			    f.add(area);			
			    Checkbox android = new Checkbox("Android",true);
	            f.add(android);
	                     android.setBounds(50,180, 100,100);
			    //frame dimensions
			f.setSize(750,750);
			f.setLayout(null);
			f.setVisible(true);
			f.addWindowListener(new WindowAdapter() {
		         public void windowClosing(WindowEvent windowEvent){
		            System.exit(0);
		         }        
		      });  

			
			}
}
