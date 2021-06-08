import java.util.*;
public class seperation
{
	public static void main(String[] args)
	{
	 int i,j,temp;
	 int a[]={1,0,1,0,1,0};
	 
	 for(i=0;i<a.length;i++)
	 {
	  for(j=i+1;j<a.length;j++)
	  { 
	     if( a[i]>a[j])
	       {
	         temp=a[i];
	         a[i]=a[j];
	         a[j]=temp;
	       
	       }
	   }
	 }
	   
	   for(i=0;i<a.length;i++)
	   {
	    System.out.print(" "+a[i]);
	    }
	    
	}
	
 }

	     
	 
	
	  
	  


	
	  
	   
	   
	
	 
	   
	   
	   
	   
	   
