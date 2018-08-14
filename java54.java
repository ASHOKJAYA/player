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
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		if(str1.length()!=str2.length()){
		System.out.println("no");
			return;
		}
		
		boolean flg=true;
		for(int i=0; i<str1.length();i++){
			if(str1.charAt(i)!=str2.charAt(i)){
				flg=false;
				break;
			}
		}
		
		if(flg){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}

	}
}
