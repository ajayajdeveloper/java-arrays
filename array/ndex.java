import java.util.*;
public class ndex {
	public static void main(String[] args)
	 {
	
	int n,i,y,m=0;
	Scanner sc=new Scanner(System.in);
  
	System.out.print("enter the number of array elements:");
		n=sc.nextInt();
	int x[]=new int[n];
	System.out.println("enter the values :" );
  
		for(i=0; i<n; i++) {
			x[i]=sc.nextInt();
		}
    
	System.out.print("enter the number to be searched  ");
		y=sc.nextInt();
      
		for(i=0;i<n;i++)
		 {
			if(x[i]==y)
			{
			m = i+1;
			break;
		        }
		
		}
		if (m != 0) System.out.println("The number is at " +m);
		   else System.out.println("Invalid entry");
	}
}
        
     
     
    

 
  
