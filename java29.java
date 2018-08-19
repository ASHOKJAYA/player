/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		        int cnt = 0; // Initialize result
 
        // Traverse through all numbers
        for (int i = a; i <= b; i++)
 
            // Check if current number 'i' is perfect
            // square
            for (int j = 1; j * j <= i; j++)
            {
                if (j * j == i)
                {
                    cnt++;
                }
            }
            System.out.print(cnt);

	}
}
