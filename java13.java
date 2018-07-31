/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int Number, R, Sum = 0;
		 Scanner sc = new Scanner(System.in);		
		Number = sc.nextInt();
		
		while(Number > 0) {
			R = Number % 10;
			Sum = Sum+ (R*R);
			Number = Number / 10;
		}
		System.out.print(Sum);
	}
}
