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
		int x1=s.nextInt();
		int y1=s.nextInt();
		int x2=s.nextInt();
		int y2=s.nextInt();
		int x3=s.nextInt();
		int y3=s.nextInt();
		if((x1==x2 && x2==x3) || (y1==y2 && y2==y3))
		System.out.print("yes");
		else if((x1==y1)&&(x2==y2)&&(x3==y3))
		System.out.print("yes");
		else
		System.out.print("no");
	

	}
}
