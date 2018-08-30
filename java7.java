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
		String str=s.nextLine();
		char ch[]=str.toCharArray();
		int i=0;
		while(i<str.length()-1)
		{
			if(i%2==0)
			{
				char t=ch[i];
				ch[i]=ch[i+1];
				ch[i+1]=t;
				
			}
			i++;
		}
		for(int j=0;j<str.length();j++)
		System.out.print(ch[j]);
	
	}
}
