import java.util.*;
public class product_array
{
  public static void main(String[] args)
  	{
  	 int a[]={1,2,3,4,5,};
  	 int b[]=new int[5];
  	 int i,j;
  	 int temp=1,n=a.length;
  	             
  	             for(i=0;i<n;i++)
  	             {
  	               b[i]=temp;
  	               temp=temp*a[i];
  	               
  	              }
  	              
  	              	temp=1;
  	              	for(j=n-1;j>0;j--)
  	              	{
  	              	  b[j]=temp*b[j];
  	              	  temp=temp*a[j];
  	              	  
  	              	}
  	              	
  	              	b[j]=temp;
  	              	System.out.println("the product is "+Arrays.toString(b));
  	              	
  	              	
  	     }
  	     
}
