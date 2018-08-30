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
				String str1=s.next();
		String str2=s.next();
		int f1=0;
		if(str1.length()==str2.length())
		{
			for(int i=0;i<str1.length();i++)
			{
				char ch1=str1.charAt(i);
				char ch2=str2.charAt(i);
				if(ch1==ch2)
				{
					f1++;
				}
			}
			if(f1==str1.length()-1)
			System.out.print("yes");
			else
			System.out.print("no");
		}
		else
		System.out.print("Must be of same length");

	}
}
