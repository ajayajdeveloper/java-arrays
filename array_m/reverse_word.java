import java.util.*;
public class reverse_word
{
 public static void main(String[] args)
 	{
 	 int i;
 	 String a="ajaykumar";
 	 char b[]=a.toCharArray();
 	 char temp;
 	 int l=b.length-1;
 	 
 	 
 	 	for(i=0;i<=l/2;i++)
 	 	       {
 	 	         temp=b[i];
 	 	         b[i]=b[l-i];
 	 	         b[l-i]=temp;
 	 	         
 	 	        }
 	 	        
 	 	     for(i=0;i<l+1;i++)
 	 	     {
 	 	      System.out.println(b[i]);
 	 	     }
 	 	     
 	 }
 	 
}
