import java.util.*;
public class sum_of_two_elements
{
	public static void main(String[] args)
	{
	 
	 int i,val;
	 int a[]={1,2,3,4,5};
	 val=6;
	 
	 for(i=0;i<a.length-1;i++)
	 {
	  for(int j=i+1;j<a.length;j++)
	  {
	  if(a[i]+a[j]==val)
	   {
	   System.out.println(+a[i]+ " and " +a[j]+"= 6");
	   }
	   
	  }
	 }
	
	
   
     }
 } 
 
 
	
