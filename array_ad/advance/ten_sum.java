import java .util.*;
public class ten_sum
{
	public static void main(String[] args)
	{
	 int n,j=0,sum=0,count=0,val;
	 n=5;
	 for(int i=19;i<100;i=i+9)
	 {
	     sum=0;
	     val=i;
	     if(count==n)
	     {
	      System.out.println(i);
	      break;
	     }
	     while(val>0)
	     {
	      j=val%10;
	      sum=sum+j;
	      val=val/10;
	      }
	      if(sum==10)
	      {
	       count++;
	      }
	   
	  }
	  
	}
}

	       
