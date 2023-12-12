package myjava;
import java.util.*;
public class DLL {
	  class Node{  

	        int item;  

	        Node previous;  

	        Node next;  

	         public Node(int item) {  

	            this.item = item;  

	        }  

	    }  

	    //Initially, head and tail is set to null

	    Node head, tail = null;  

	   

	    //add a node to the list  

	    public void addNode(int item) {  

	        //Create a new node  

	        Node newNode = new Node(item);  

	        //if list is empty, head and tail points to newNode  

	        if(head == null) {  

	            head = tail = newNode;  

	            //head's previous will be null  

	            head.previous = null;  

	            //tail's next will be null  

	            tail.next = null;  

	        }  

	        else {  

	            //add newNode to the end of list. tail->next set to newNode  

	            tail.next = newNode;  

	            //newNode->previous set to tail  

	            newNode.previous = tail;  

	            //newNode becomes new tail  

	            tail = newNode;  

	            //tail's next point to null  

	            tail.next = null;  

	        }  

	    }  

	    public void deleteNodes() {

	    	int x = head.item;

	        head = head.next;

	        System.out.println("Element "+x +" got deleted");

	   }
	    public void exit()
	    {
	    	System.out.println("Exiting");
	    }

	//print all the nodes of doubly linked list  

	    public void printNodes() {  

	        //Node current will point to head  

	        Node current = head;  

	        if(head == null) {  

	            System.out.println("Doubly linked list is empty");  

	            return;  

	        }  

	        System.out.println("Nodes of doubly linked list: ");  

	        while(current != null) {  

	            //Print each node and then go to next.  

	            System.out.print(current.item + " ");  

	            current = current.next;  

	        }  

	    }  

	    public static void main(String args[])
	    {
	    	Scanner in=new Scanner(System.in);
	    	DLL ob=new DLL();
	    	int n;
	    	do {
	    	System.out.println("Enter \n 1.To add \n 2.Delete  \n 3. Display\n 4.Exit\n");
	    	n=in.nextInt();
	    	switch(n)
	    	{
	    	case 1:
	    	{
	    		int p;
	    		System.out.println("Enter the value");
	    		p=in.nextInt();
	    		ob.addNode(p);
	    	}
	    	break;
	    	case 2:
	    	{
	    		
	    		ob. deleteNodes();
	    	}
	    	break;
	    	case 3:
	    	{
	    	ob. printNodes();
		    	}
	    	break;
	    	case 4:
	    		ob.exit();
	    		break;
	    	}
	    	
	    }while(n<=3);
	}
}