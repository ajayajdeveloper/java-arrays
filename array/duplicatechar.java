import java.util.*;
public class duplicatechar
{
 public static void main(String[] args)
 {
  int i,j;
  String z[]={"ab","cd","ca","ab","dt","aa"};
  for(i=0;i<z.length-1;i++)
  	{
  	 for(j=i+1;j<z.length;j++)
  	 {
  	  if(z[i]==z[j])
  	  {
  	   System.out.println("duplicate value :" +z[i]);
  	   }
  	  }
  	 }
  	 
   }
 }	 
  

  	
 
