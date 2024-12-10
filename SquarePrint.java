package My_Package;
import java.util.*;
import java.io.*;

public class SquarePrint {

	public static void main(String[] args) {
           /*for (int i=1;i<=5;i++) {
        	   for(int j=1;j<=i;j++) {
        		   System.out.print("* ");
        	   }
        	   System.out.println();
        	   */
		/*int i=1,j;
            while(i<=5)
            {
            	j=1;
            	while(j<=i)
            	{
            		System.out.print("* ");
            		j++;
            	}
            	System.out.println();
            	i++;
            }
            */
		
		/*for (int k=1;k<=5;k++) {
     	   for(int j=5;j>=1;j--) {
     		   if(j<=k)
     			  System.out.print("*");
     			   
     		   else
     			  System.out.print(" ");
     	   }
     	   System.out.println();
	    }*/
		
		/*for (int k=1;k<=5;k++) {
	     	   for(int j=5;j>=1;j--) {
	     		   if(j<=k)
	     			  System.out.print("* ");
	     			   
	     		   else
	     			  System.out.print(" ");
	     	   }
	     	   System.out.println();
		    }
		    */
		
		int rows=4 ,starprint=1;
		for (int i=1;i<=5;i++)
		{
			for (int j=1;j<=rows;j++)
			{
				System.out.print(" ");
			}
			rows--;
			for (int k=1;k<=starprint;k++)
			{   
				System.out.print("*");
			}
			starprint+=2;
			System.out.println();
		}


}}
        
