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
		try{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

			  int n=Integer.parseInt(br.readLine());

			  int last=n%10;
			  int first=0;
			  while(n>=1){
				  first=n;
				  n=n/10;
			  }

	System.out.println(first+last);
	}

	catch(IOException e){
		System.out.println("error in input");
		}

	}
}
