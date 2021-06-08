import java.util.*;
public class stair
{
 public static void fun(int a[],int sum,int pos)
 	{
          if(sum>4)
           {
           return;
           }
           	if(pos>4)
           	{
           	 return;
           	}
                  if(sum==4)
                  {
                     for(int j=0;j<pos ;j++)
                       {
                        System.out.print(a[j]);
                        }
                        
                        System.out.println();
                        return;
                        
                   }
                   
                   else
                   {
                     for(int i=1;i<=2;i++)
                      {
                        a[pos]=i;
                        fun(a,sum+i,pos+1);
                      }
                      return;
                      
   
                   }
            }
                    
                     public static void main(String[] args)
                     {
                        int a[]=new int [5];
                        fun(a,0,0);
                        
                      }
            }
            

