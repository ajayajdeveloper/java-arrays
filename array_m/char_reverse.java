import java.util.*;
public class char_reverse
{
	public static void main(String[] args)
		{
		  int i;
		  char a[]={'a','b','c','d','e'};
		  char temp;
		  int l=a.length-1;
		  	for(i=0;i<=l/2;i++)
		  	{
		  	  temp=a[i];
		  	  a[i]=a[l-i];
		  	  a[l-i]=temp;
		  	  
		  	 }
		  	 
		  	for(i=0;i<l+1;i++)
		  	{
		  	 System.out.println(a[i]);
		  	 
		  	}
		  	
		  	
		 }
}
		  
