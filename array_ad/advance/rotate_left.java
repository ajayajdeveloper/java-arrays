import java.util.*;
public class rotate_left
{
	public static void main(String[] args)
		{
                 int i;
                 int a[]={1,2,3,4,5};
                 int temp=a[0],temp1=a[1];
                 
                 	for(i=0;i<a.length-2;i++)
                 		{
                 		 a[i]=a[i+2];
                 		 
                 	        }
                 		
                 		
				   a[a.length-2]=temp;
				   a[a.length-1]=temp1;
				   
				   System.out.println(Arrays.toString(a));
				   
	
                }
  }			   
