package myjava;
import java.awt.*;
import java.awt.event.*;
class TextListenerDemo extends Frame implements TextListener
{
TextField t;
    public TextListenerDemo()
    {
    	setTitle("TextListener for TextField");
        setLayout(new FlowLayout());
        t=new TextField(20);
        t.addTextListener(this);
        add(t);
 setSize(400,400);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
	         public void windowClosing(WindowEvent e) {
	           System.exit(0);
	         }
	       });
    }
    // Called whenever the text in a text component (here t) changes
    public void textValueChanged(TextEvent te){
        // Update the frame title
        setTitle(t.getText());
    }
  public static void main(String args[]){
        new TextListenerDemo();
    }
}