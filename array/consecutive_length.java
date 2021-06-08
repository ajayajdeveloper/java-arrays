import java.util.*;
 class  consecutive_length
	{
	 public static void main(String[] args)
	 {
	  int i,j=0;
	  int c=1,max=0;
	  int a[]={1,2,50,60,3,4,5,11,12,13,14,15,16,17};
	  int g[]=new int[7];
	 
	  
	  Arrays.sort(a);
	  System.out.println(Arrays.toString(a));
	 
	  for(i=0;i<a.length-1;i++)
	  {
		   if(a[i+1]-a[i]!=1)
		   {
		   c=1;
		 
		    }
		    if(a[i+1]-a[i]==1)
		   {
		   g[c-1]=a[i];
		   c++;
		 
		    }
		    if(max<c){
		    max=c;
		    g[max-1]=a[i+1];
		    }
	   
	    }
	  System.out.println("the consecutive elements are "+Arrays.toString(g));
	  System.out.println("the consecutive elements length is :"+max);
	 }
	
	 
   }   


	   
	      
	  
	   
	   
	   

