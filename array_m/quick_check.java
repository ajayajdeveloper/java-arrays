import java.util.*;
public class quick_check
{
  public static void main(String[] args)
  {	
  	int i,j,c=0;
  	int a[]={1,3,5,7,2,4,6,8};
  	int val=7,temp;
  	
  	 for(i=0;i<a.length;i++)
  	 	{
  	 	  for(j=i+1;j<a.length;j++)
  	 	  	{
  	 	  	  
  	                   if(a[i]>a[j])
  	                   {
  	                     temp=a[i];
  	                     a[i]=a[j];
  	                     a[j]=temp;
  	                     
  	                    }
  	                    
  	                 }
  	                 
  	         }
  	         
  	         
		  	       for(i=0;i<a.length;i++)
		  	       		{
		  	       		  if(a[i]==val)
		  	       		  {
		  	       		    c=1;
		  	       		    
		  	       		   }
		  	       		   
		  	       		 }
  	       		 
  	       		 
  	       		 	                  if(c==1)
  	       		 	                         {
  	       		 	                          System.out.println("the given interger is present in array");
  	       		 	                          }
  	       		 	                          
  	       		 	                          else
  	       		 	                          {
  	       		 	                          System.out.println("the given interger is not present in array");
  	       		 	                          }
  	       		 	                          
  	       	}
  	       	
 }	 	                   
  	       		 	                   
  	       		 	                   
                 
  	       		 
  	       
  	       
  	
  		
  	
