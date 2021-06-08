import java.util.*;
public class near
{
	public static void main(String[] args)
	{
		int i,j,s;
		int a[]={1,2,-1,-5,6,7,-3,9};
		int sum=99999,l=0,m=0;
		
			for(i=0;i<a.length-1;i++)
				{
				 for(j=i+1;j<a.length;j++)
	                         {
	                           s=a[i]+a[j];
	                            if(Math.abs(sum)>Math.abs(s))
	                            {
	                              sum=s;
	                              l=i;
	                              m=j;
	                              
	                             }
	                           }
	                          }
	                          
	                          System.out.println("the sum closest to zero "+l+"and"+m);
	                          
	            }
	     }
