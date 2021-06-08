import java.util.*;
public class insertarray
{
	public static void main (String[] args)
	{
		int n=5,pos=2;
		int i;
		int a[]={10,20,30,40,50};
		
		System.out.println("the array are :"+Arrays.toString(a));
		
		for(i=a.length-1;i>pos;i--)
			{
			a[i]=a[i-1];
			}
			
			a[pos]=n;
			System.out.println("new array is :"+Arrays.toString(a));
	}
}
		
		
		
		
