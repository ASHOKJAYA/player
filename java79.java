/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone

{
		public static int maxDiff(int arr[], int arr_size) 
    {
        int max_diff = arr[1] - arr[0];
        int i, j;
        for (i = 0; i < arr_size; i++) 
        {
            for (j = i + 1; j < arr_size; j++) 
            {
                if (arr[j] - arr[i] > max_diff)
                    max_diff = arr[j] - arr[i];
            }
        }
        return max_diff;
    }
 
    /* Driver program to test above functions */
    public static void main(String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	
       // MaximumDiffrence maxdif = new MaximumDiffrence();
        int arr[] = new int[n];	
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
        System.out.println(maxDiff(arr, 5));
    
  	}
}
