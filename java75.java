/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
       public static int CountPair(int arr[] , int n )
    {
        int result = 0; // Initialize result
      
        for (int i = 0; i < n; i++)
        {
            // Generate all pair and increment
            // counter if the hold given condition
            for (int j = i + 1; j < n; j++)
                if (arr[i] < arr[j] )
                    result ++;
        }
        return result;
    }
     
    /* Driver program to test above function */
    public static void main(String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
    	int m=sc.nextInt();
        int arr[] = new int[m];
        for(int i=0;i<m;i++)
        {
        	arr[i]=sc.nextInt();
        }
        int n = arr.length;
        System.out.println(CountPair(arr, n));
          
    }
}
