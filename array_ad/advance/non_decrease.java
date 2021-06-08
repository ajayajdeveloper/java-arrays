import java.util.*;
public class non_decrease
{
	public static void main(String[] args)
	{
	 int i;
	 int a[]={10,5,1};
	 int n=a.length,count=0;
	 	
	 	for(i=0;i<n-1;i++)
	 		{
	 		 if(a[i]>a[i+1])
	 		   
	 		   count++;
	 		   }

                             if(count==1)
                             	System.out.println("true");
                             	else
                             	System.out.println("false");
                             	
                         }
          
          
          }
