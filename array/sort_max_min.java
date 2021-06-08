import java.util.*;
public class sort_max_min
{
	public static void main(String[] args)
	
		{
		 int i,j;
		 int temp;
		 int a[]={1,2,3,4,5,6,7,8,9,10};
		 
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
		         
		         
		   for(i=0,j=a.length-1;i<=a.length-1 && j>=i;i++,j--)
		   {
		    if(a[i]!=a[j]) 
		    {
		             System.out.print(a[j]+ " " +a[i]+ " ");
		    }
		    
		   }
       }
       
    }
		 
