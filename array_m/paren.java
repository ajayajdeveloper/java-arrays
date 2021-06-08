import java.util.*;
public class paren
{
	public static void main(String[] args)
	{
		String s="Sometimes (when I nest them (my parentheticals) too much (like this (and this))) they get confusing.";
		char[] a=s.toCharArray();
		int l=a.length;
		char[] b=new char[a.length];
		int i,j=0;
		for(i=0;i<l;i++)
		{
			if(a[i]=='(')
			{
				
				j++;
			
			}
			if(a[i]==')')
			{
			        j--;
					
				
			}
			
		}
				
		if(j==0)
		{
			System.out.println("True ");
		}
		else
		{
			System.out.println("False");
		}
		
	}
}
				

