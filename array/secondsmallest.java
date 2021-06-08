import java.util.*;
public class secondsmallest
{
	public static void main(String[] args)
	{
		int i,n;
		int a[]={10,20,40,30,50};
		System.out.println("the arrays are"+Arrays.toString(a));	 		       
		Arrays.sort(a);

		n=a[1];
		System.out.println("the second largest :"+n);
	}



}


