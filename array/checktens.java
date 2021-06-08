import java.util.*;
public class checktens
{
 public static void main(String[] args)
 {
   int i,m=0;
   int a[]={10,3,40,10,7,8,10};
   
    for(i=0;i<a.length;i++)
    {
     if(a[i]==10)
      {
      m=m+a[i];
      }
      
    }
    
    if(m==30)
    {
     System.out.println("true");
     
    }
    
    else
    {
     System.out.println("false");
     }
     
   }
  }
   
