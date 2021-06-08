import java.util.*;
public class specificvalue
{
	public static void main(String[] args)
	{
         int i,value;
         int a[]={1,2,3,4,5};
         int x=1;
         boolean found=false;
         Scanner sc=new Scanner(System.in);
         
         System.out.println(" "+Arrays.toString(a));
         System.out.println("enter the number to check:");
         
         value=sc.nextInt();
         for(i=0;i<5;i++)
          { 
           if(a[i]==value)
           {
            found=true;
            System.out.println("enter the value : "+value+" is present in the array");
            }
            
           }
           if(!found)
            {
             System.out.println("not found");
             }
         }
 }
        
            
