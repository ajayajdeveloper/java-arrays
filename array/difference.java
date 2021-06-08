import java.util.*;
public class difference
{
	public static void main(String[] args)
	{
	 int i,d,max=0,min=999;
	 int a[]={100,200,300,400};
	 
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
	      
	    System.out.println(max-min);
	}
}
	    
	    
	 
	    
	   
	    
	 
	 
