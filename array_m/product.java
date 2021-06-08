import java.util.*;
public class product 
{
 public static void main (String[] args)
  {	
   int i,j;
   int a[]={1,2,3,4,5,6,7,8};
   int product,c=0,mul=0;
   int l=a.length-1;
   	
   	for(i=0;i<l;i++)
   		{
   		 for(j=i+1;j<l;j++)
   		      {
   		        if(a[i]>=0)
   		           {
   		               product=a[i]*a[j]*a[j+1];
   		               c=product;
   		               
   		           }
   		           
	   		           if(mul<c)
	   		           {
	   		            mul=c;
	   		            }
   		            
   		        }
   		        
   		    }
   		    System.out.println(mul);
   		    
   }
   
   
 }
