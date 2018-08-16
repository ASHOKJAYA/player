/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
    public static void main (String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	int m=sc.nextInt();
    	int sum=1;
    	for(int i=0;i<m;i++)
    	{
    		sum=sum*n;
    	}
    	System.out.print(sum);
             
    }
}
