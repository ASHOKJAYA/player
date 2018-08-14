/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	    static int arraySortedOrNot(int arr[], int n)
    {
        // Array has one or no element or the
        // rest are already checked and approved.
        if (n == 1 || n == 0)
            return 1;
      
        // Unsorted pair found (Equal values allowed)
        if (arr[n-1] < arr[n-2])
            return 0;
      
        // Last pair was sorted
        // Keep on checking
        return arraySortedOrNot(arr, n-1);
    }

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		        // check the result for true/false and print.
		        Scanner sc=new Scanner(System.in);
		        int n=sc.nextInt();
		        int[] arr=new int[n];
		        for(int i=0;i<n;i++)
		        {
		        	arr[i]=sc.nextInt();
		        }
		        int x=arr.length;
		                if (arraySortedOrNot(arr, x)!=0)
		                {
			System.out.println("yes");
		                }else
		                {
			System.out.println("no");
		                }
		        
		        
	}
}
