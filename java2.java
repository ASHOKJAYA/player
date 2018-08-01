
import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		  Scanner sc=new Scanner(System.in);
		int num=sc.nextInt(); 
		int i=1;
		         long factorial = 1;
        while( i<= num)
        {
            factorial *= i;
            i++;
        }
        System.out.print(factorial);

	}
}
