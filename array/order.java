import java.util.*;
public class order
{
	public static void main(String[] args)
	{
	 int i,m=0;
	 int a[]={2,0,1,0,3,0};
	 
	 for(i=0;i<a.length;i++)
	 {
	  if(a[i]!=0)
	  {
	  a[m]=a[i];
	  m++;
	  }
	 
	 }
	 while(m<a.length)
	  {
	  a[m++]=0;
	  }
	  
	  System.out.print(Arrays.toString(a));
	}
}
	  
	  
	
	  
	   
	   
	
	 
	   
	   
	   
	   
	   
