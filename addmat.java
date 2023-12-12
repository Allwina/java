package myjava;
import java.util.*;

public class addmat {
	
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int m,n,p,q,i,j;
			int a[][]=new int[10][10];
			int b[][]=new int[10][10];
			int c[][]=new int[10][10];
	//reading 1st matrix		
			System.out.println("enter the no of rows and coloumns of first matrix");
			m=sc.nextInt();
			n=sc.nextInt();
			System.out.println("enter the elements int the first matrix");
			for(i=0;i<m;i++)
			{
			 for(j=0;j<n;j++)
			 {
				 a[i][j]=sc.nextInt(); 
			 }
			}
	//readind 2nd matrix		
			System.out.println("enter the no of rows and coloumns of 2nd matrix");
			p=sc.nextInt();
			q=sc.nextInt();
			System.out.println("enter the elements in the 2nd matrix");
			for(i=0;i<p;i++)
			{
			 for(j=0;j<q;j++)
			 {
				 b[i][j]=sc.nextInt(); 
			 }
			}
			if((m==p)&&(n==q))
			{	
	//addition		
			for(i=0;i<m;i++)
			{
			 for(j=0;j<n;j++)
			 {
				 c[i][j]=a[i][j]+b[i][j]; 
			 }
			}
			
	//display matrix1
			System.out.println("the bfirst matrix is");
			for(i=0;i<m;i++)
			{
			 for(j=0;j<n;j++)
			 {
				 System.out.print(a[i][j]+"\t ");  
			 }
			 System.out.println("\n");
			}
	//display matrix2
			System.out.println("the 2nd matrix is");
					for(i=0;i<p;i++)
					{
					 for(j=0;j<q;j++)
					 {
						 System.out.print(b[i][j]+"\t ");  
					 }
					 System.out.println("\n ");
					}		
	//display matrix3
					System.out.println("the added matrix is");
					for(i=0;i<m;i++)
					{
					 for(j=0;j<n;j++)
					 {
						 System.out.print(c[i][j]+"\t ");  
					 }
					 System.out.println("\n ");
					}				
			}
		}

	}


