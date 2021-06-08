import java.util.*;
public class copyArray
{
	public static void main(String[] args)
	{
	 int n,num,i;
	 int[]a={10,20,30,40,50,60,70,80,90,100};
	 int[]b=new int[10];
	 
	 
	 	System.out.println("the array values are : ");
	 	for(i=0; i<a.length; i++)
	 	{
	 	b[i]=a[i];
	 	System.out.print(b[i]+" ");
	 	
	 	}
	 	System.out.println("");
	 		System.out.println("the arrays are :"+Arrays.toString(b)+" \n");
        }
}
	 	
	 
		
