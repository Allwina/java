package myjava;
import java.util.*;
public class seclargenum {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		// TODO Auto-generated method stub
		int l,i;
        System.out.println("Enter the length of array");
        l=in.nextInt();
        int a[]=new int[l];
        for(i=0;i<l;i++)
        {
        	System.out.println("Enter the elements");
        	a[i]=in.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Second smallest element="+a[1]);
	}

}
