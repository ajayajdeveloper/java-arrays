import java.util.*;
public class four_element
{
	public static void main(String[] args)
	{
	 int i,j,m,n;
	 int a[]={5,8,10,15,9,20};
	 int val=50;
	 
	 	for(i=0;i<a.length;i++)
	 		{
	 		 for(j=i+1;j<a.length;j++)
	 		 	{
	 		 	for(m=j+1;m<a.length;m++)
	 		 		{
	 		 		 for(n=m+1;n<a.length;n++)
	 		 		 	{
	 		 		 	  if(a[i]+a[j]+a[m]+a[n]==val)
	 		 		 	  	{
	 		 		 	  	 System.out.print(a[i]+"+"+a[j]+"+"+a[m]+"+"+a[n]+"="+val);
	 		 		 	  	 break;
	 		 		 	  	 }
	 		 		 	  	 
	 		 		 	 }
	 		 		 }
	 		      }
	 		   }
	}
}
	 		
