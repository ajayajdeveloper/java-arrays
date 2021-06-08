import java.util.*;
public class overlapping
{
	public static void main(String[] args)
	{
         int i,j=0;
         int a[][]={{1,3},{4,10},{5,8},{20,25}};
         for(i=0;i<3;i++)
         {
         	if(a[i][1]<a[i+1][1])
         	{
         	 System.out.println("{"+a[i][0]+","+a[i][1]+"}");
         	}
         	
         }
          System.out.println("{"+a[i][0]+","+a[i][1]+"} ");
         }
}
 
 
 
 
 
 
 
 
 
 
          
