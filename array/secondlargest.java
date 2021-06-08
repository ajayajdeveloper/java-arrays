import java.util.*;
public class secondlargest
{
	public static void main(String[] args)
	{
	 	int i,n;
	 	int a[]={10,20,40,30,50};
	 	System.out.println("the arrays are"+Arrays.toString(a));	 		       
	        Arrays.sort(a);
	 	n=a.length-1;
	 	
	 	if(a[n]==a[a.length-1])
	 	 {
	 	  n--;
	 	  System.out.println("the second largest :"+a[n]);
	 	  }
	 	  
	 	  
	 	  
	 }
}
	 	
