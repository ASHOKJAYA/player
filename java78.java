/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
 public static void sortedMerge(int a[], int b[], 
                                   int res[], int n, 
                                   int m)
    {
        // Concatenate two arrays
        int i = 0, j = 0, k = 0;
        while (i < n) {
            res[k] = a[i];
            i++;
            k++;
        }
         
        while (j < m) {
            res[k] = b[j];
            j++;
            k++;
        }
     
        // sorting the res array
        Arrays.sort(res);
    }
     
    /* Driver program to test above function */
    public static void main(String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
    	int n1=sc.nextInt();
    	int m1=sc.nextInt();
        int a[] = new int[n1];
        int b[] = new int[m1];
        for(int i=0;i<n1;i++)
        {
        	a[i]=sc.nextInt();
        }
        for(int i=0;i<n1;i++)
        {
        	b[i]=sc.nextInt();
        }
        int n = a.length;
        int m = b.length;
     
        // Final merge list
        int res[]=new int[n + m];
        sortedMerge(a, b, res, n, m);
     
        
        for (int i = 0; i < n + m; i++)
            System.out.print(" " + res[i]); 
   	}
}
