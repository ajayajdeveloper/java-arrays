import java.util.*;
public class largest_product 
{
	public static void main(String[] args)
	{
          int n,p,q;
          int a[]={-10,-10,5,2};
          Arrays.sort(a);
          n=a.length;
          		
          		
          		p=a[n-1]*a[n-2]*a[n-3];
          		q=a[0]*a[1]*a[2];
          		
          		if(p>q)
          		 {
          		 System.out.println("the largest product is "+a[n-1]+" "+a[n-2]+" "+a[n-3]);
          		 }
          		 else
          		  {
          		  System.out.println("the largest product is "+a[0]+" "+a[1]+" "+a[n-1]);
          		  }
          		  
         }
 }
