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
		        // check the result for true/false and print.
		        Scanner sc=new Scanner(System.in);
		        int x=sc.nextInt();
		        int y=sc.nextInt();
        System.out.println(isPower(y, x) ? true : false);
        //System.out.println(isPower(1, 20) ? 1 : 0);
        //System.out.println(isPower(2, 128) ? 1 : 0);
        //System.out.println(isPower(2, 30) ? 1 : 0);
    }
    /* Returns true if y is a power of x */
    public static boolean isPower(int x, int y)
    {
        // The only power of 1 is 1 itself
        if (x == 1)
            return (y == 1);
 
        // Repeatedly compute power of x
        int pow = 1;
        while (pow < y)
            pow = pow * x;
 
        // Check if power of x becomes y
        return (pow == y);

	}
}
