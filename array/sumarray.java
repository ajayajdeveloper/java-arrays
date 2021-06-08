import java.util.*;
class sumarray
{
	public static void main(String [] args)
	{
		int i,n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the array");
		n=sc.nextInt();

		int a[]=new int[n];
		System.out.println("enter all the array");

		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.print("sum :"+sum);
	}
}   



