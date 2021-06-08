import java.util.*;
public class removedup
{
 public static void main(String[] args)
 {
  int c=0,i,j;
  int a[]={1,2,3,3,3,4,5,6,7,8};
  int t[]=new int[8];
  
  for(i=0;i<a.length-1;i++)
   {
     if(a[i]!=a[i+1])
     {
       t[c++]=a[i];
     }
     
    }
   
   t[c]=a[i];
   
    System.out.println(Arrays.toString(t));
  }
  
 }
    
    
   

