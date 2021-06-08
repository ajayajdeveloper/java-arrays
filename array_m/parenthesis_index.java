import java.util.*;
public class parenthesis_index
{
	public static void main(String[] args)
	{
		String s="Sometimes (when I nest them (my parentheticals) too much (like this (and this))) they get confusing.";
		char[] a=s.toCharArray();
		int ind=0;
		int l=a.length;
		char[] b=new char[a.length];
		int i,j=0,d=0;
		for(i=0;i<l;i++)
		{
			 if(a[i]=='(')
			 j++;
		         
		         if(a[i]==')')
			{ j--;
					
			if(j==ind)
			{
			d=i;
			System.out.println("True and pos " +d);
			break;
			}
		     }
		}
	}

}
				

