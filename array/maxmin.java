import java.util.*;
public class maxmin
{
 	public static void main(String[] args)
 	{
  	 int i,max=1,min=1000;
  	 int array[]={1,2,3,4,5,6,7,8,9,10};
  	 for(i=0;i<10;i++)
  	 	{
  	 	  if(array[i]>max)
  	 	  {
  	 	  max=array[i];
  	 	  }
  	 	  if(array[i]<min)
  	 	  {
  		  min=array[i];
  		  }
  		 }
  		 System.out.println(max);
  		 System.out.println(min);
  		 
  	}
  }
  		  
  
  
  
  
