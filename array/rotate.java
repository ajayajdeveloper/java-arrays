import java.util.*;
public class rotate
{
	public static void main(String[] args)
	{
		int i;
		int a[]={5,6,7,1,2,4,5};
		int c=0;
		int min=a[0];
		
			for(i=0;i<a.length-1;i++)
		        {
				 if(min>a[i])
				 {
				 min=a[i];
				 c=i;
				 }
				 
				 
		         }
		         
		         System.out.print( " the rotate value is "+c);
		         
		 }
}
		
