import java.util.*;
public class equality
{
	public static void main(String[] args)
	{	
	 	int i,j,c=0;
	 	int a[]={1,2,3,4,5};
	 	int b[]={1,2,3,4,5};
	 	
	 	for(i=0;i<a.length;i++)
	 	 {
	 	   
	 	      if(a[i]==b[i])
	 	      {
	 	       c++;
	 	       
	 	      }
	 	      else
	 	      {
	 	        break;
	 	      }        
	 	  }
	 	  if(c==5)
	 	  {
	 	    System.out.println("they are equality");
	 	  }
	 	  else 
	 	  System.out.println("they are not equal");
	 }
}


	 	         
	 	     
	 	  
	      
