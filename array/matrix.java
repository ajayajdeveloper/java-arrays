import java.util.*;
public class matrix 
{
 public static void main(String[] args)
 {
  int i,j;
  int [][]p={ {1,2,3},{4,5,6},{7,8,9} };
  int [][]q={ {9,8,7},{6,5,4},{1,2,3} };
  int [][]r=new int[3][3];
  
   for(i=0 ;i<3;i++)
   {
    for(j=0;j<3;j++)
     {
      r[i][j]=p[i][j]+q[i][j];
      System.out.print(r[i][j]+" ");
     
      }
     
     System.out.println();
     
    }
    
   }
 }
   
  
  
