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
		int n=s.nextInt();
		int fa[]=new int[1000];int k=0;
		for(int i=1;i<=n;i++)
		{
			int cnt=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				cnt++;
			}
			if(cnt==2)
			{
				if(n%i==0)
				fa[k++]=i;
			}
		}
		System.out.print(fa[0]);
		for(int t=1;t<k;t++)
		System.out.print(" "+fa[t]);
	//*	if(t<k)
	//	{
		//System.out.print(" ");
		//}

	}
}
