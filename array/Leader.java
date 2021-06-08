import java.util.*;
public class Leader
{
	public static void main(String[] args)
	{
	 int a[]={10,23,15,0,9,3,8};
	int c=0;
	 
	 for(int i=0;i<a.length;i++)
	 {
	  c=0;
	  for(int j=i+1;j<a.length;j++)
	   {
	    if(a[i]<a[j])
	   {
	    c=1;
	   }
	 }
	  if(c==0)
	  {
	   System.out.println(+a[i]+" is a leader");
	   }
	   
      }

   }

}

