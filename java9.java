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
		int pc=0;
		for(int i=l;i<=r;i++)
		{
			int cnt=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				cnt++;
			}
			if(cnt==2)
			pc++;
		}
		System.out.print(pc);


	}
}
