import java.util.*;
public class clock_rotation
{
 public static void main(String[] args)
 {
  
  int i,j;
  int a[]={1,2,3,4,5};
  int b[]= new int[a.length];
  
  int l=a.length-1;
  	for(i=0;i<l;i++)
        {
  		 if(a[i]==a[l-1])
  		 {
  		 	b[0]=a[l];
  		 }
  		 if(a[i]>0)
  		 {
  		 	b[i+1]=a[i];
  		 }
        }
         
        for(i=0;i<l+1;i++)
        	{
        	 System.out.println(b[i]);
        	 
        	 }
        	
       }
}
  		 
  		
  
