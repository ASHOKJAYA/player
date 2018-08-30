/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
					Scanner s=new Scanner(System.in);
		int l=s.nextInt();
		int r=s.nextInt();
		for(int i=1;i<=l*r;i++)
		{
			if(i%l==0 && i%r==0)
			{
				System.out.print(i);
				break;
			}
		}

		

	}
}
