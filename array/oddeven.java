import java.util.*;
public class oddeven
{
	
	  public static void main(String[] args) 
	  {
	  
	  int i,m=0,m1=0;
	  int a[]={1,2,3,4,5,6,7,8};
	  
	  for(i=0;i<a.length;i++)
	    {
	      if(a[i]%2==0)
	      {
	      m++;
	      }
	  	 else
	        {
	          m1++;
	        }
	        
	     }
	         
	         System.out.println("the number of even number : "+m);
	         System.out.println("the number of odd number  : "+m1);
	         
	     
	  }
}
	    
	   
	  
	  
	
