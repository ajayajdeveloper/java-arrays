import java.util.*;
class avgarray
{
	public static void main(String [] args)
	{
		int i,n,sum=0,length ;
		float avg;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the array length");
		n = sc.nextInt();
		int a[] = new int[n];


		System.out.println("enter all the array");

		for(i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
			sum = sum + a[i];
		}

		avg = sum/a.length;
		System.out.print("avg:"+avg);
	}
}   



