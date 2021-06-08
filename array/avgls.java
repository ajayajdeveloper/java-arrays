import java.util.*;
public class avgls
{
 	public static void main(String[] args)
 	{
 	 int i,m,n,max=0,min=2000,total=1000;
 	 int[] a={100,200,300,400};
 	 float avg;
 	 
 	 for(i=0;i<a.length;i++)   
 	  {
 	  
 	     if(max<a[i])
 	     {
	       max=a[i];
	      
	      }
	     if (min>a[i])
	      {
	      min=a[i];
	      }
	      
	     
	   }
	    
	      n=max+min; 
	      m =total-n ; 
	      avg=m/2;
	      
	      System.out.println(avg);
	      
	      
	}
	      
}	   
	      

	
 	 
 	 
 	 
