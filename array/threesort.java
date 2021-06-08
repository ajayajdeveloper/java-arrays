import java.util.*;
public class threesort
{
	public static void main(String[] args)
	{
	 int i,j,k;
	 int a[]={2,4,6,8,10};
	 int b[]={3,6,9,12,15};
	 int c[]={6,12,18,24,30};
	 
	 for(i=0;i<a.length;i++)
	 {
	  for(j=0;j<b.length;j++)
	  {
	    if( a[i]==b[j] )
	    
	    {
	      for(k=0;k<c.length;k++)
	        {
	         if(c[k]==a[i])
	         
	           {
	             System.out.println("the common elements in the arrays are"+a[i]);
	             
	             }
	          }
	          
	      }
	      
	    }
	    
	    
	  }
	  
	  
      }
  }
	 
	 
	 
	 
