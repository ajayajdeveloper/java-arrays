import java.util.*;
public class duplicate
{
 public static void main(String[] args)
 {
  int i,j;
  int a[]={10,20,30,40,30,10,70};
  for(i=0;i<a.length-1;i++)
  	{
  	 for(j=i+1;j<a.length;j++)
  	 {
  	  if(a[i]==a[j])
  	  {
  	   System.out.println("duplicate value :" +a[i]);
  	   }
  	  }
  	 }
  	 
   }
 }	 
  

  	
 
