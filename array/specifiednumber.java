import java.util.*;
public class specifiednumber
{
 public static void main(String[] args)
 {
  
  int a[]={1,2,3,4,5,6,7};
  int n=10;
  
   for(int i=0;i<a.length;i++)
   {
    for (int j=i+1;j<a.length;j++)
     {
      if(a[i]+a[j]==n)
       {
      
       System.out.println("the location of pair is["+i+"]["+j+"] and the value is "+a[i]     +"and"+a[j]);
       }
     }
   }
   
 }
 
} 
