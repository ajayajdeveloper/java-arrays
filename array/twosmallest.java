import java.util.*;
public class twosmallest
{
	public static void main(String[] args)
	{	
		int i,j,min=0,temp;
		int[] a={10,50,60,20,30,40};
		
			for(i=0;i<a.length-1;i++)
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
		          
		          min=a[0];
		          System.out.println(+min);
		          
		          for(i=0;i<a.length-1;i++)
		          {
		               if(min!=a[i])
		              {
		              System.out.println(a[i]);
		              break;
		              }
		            
		           }
	    }
	
	}
		            
				     
				 
				 
	
		
		
