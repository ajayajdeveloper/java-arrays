import java.util.*;
public class diagonal
{
	public static void main(String[] args)
	{
	 int i,j,k;
	 int a[][] ={ {1,2,3},{4,5,6},{7,8,9} };
	 int l1=a.length;
	 int l2=a[0].length;
	 
	 	for(i=0;i<l1;i++)
	 		{
	 		 for(j=i,k=0; j>=0 && k<l1 ;k++,j--)
	 		 	{
	 		 	 System.out.print(a[j][k]+" ");
	 		 	 
	 		 	 }
	 		 	 
	 		 	 System.out.println();
	 		 	 
	 		 }
	 		 
	 		 
	 	for(i=1;i<l2;i++)
	 		{
	 		 for(j=l2-1,k=i; j>0 && k<l2 ;k++,j--)
	 		 	{
	 		 	 System.out.print(a[j][k]+" ");
	 		 	 
	 		 	 }
	 		 	 
	 		 	 System.out.println();
	 		 	 
	 		 }

     }
     
     }	 	
