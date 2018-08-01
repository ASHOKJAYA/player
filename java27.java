/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	     static void convertOpposite(StringBuffer str)
     {
        int ln = str.length();
            
        // Conversion using predefined methods
        for (int i=0; i<ln; i++)
        {
            Character c = str.charAt(i);
            if (Character.isLowerCase(c))
                str.replace(i, i+1, Character.toUpperCase(c)+"");
            else
                str.replace(i, i+1, Character.toLowerCase(c)+"");
            
        }
     }
      
     public static void main(String[] args) 
     {
         Scanner sc=new Scanner(System.in); 
         StringBuffer str=new StringBuffer();
         str.append(sc.nextLine());

   

         
         // Calling the Method
         convertOpposite(str);
          
         System.out.println(str);

	}
}
