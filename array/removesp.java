import java.util.*;
public class removesp
 {
  public static void main(String[] args)
  {
  
    Scanner sc = new Scanner(System.in);
    int i;

    int[]array={15,25,35,45,55,65,75};
    System.out.println("the array values are :"+Arrays.toString(array)+" \n");
    
    System.out.println("Which number to be removed (INDEX): ");
   int num = sc.nextInt();
    
    
    if(num < 7){
    
    
    for(i=num ;i<array.length-1; i++)
    {
     array[i]=array[i+1];
     }
      System.out.print("after removing the element : " );
 		for(i=0; i<array.length-1; i++){   
 		
        System.out.print(array[i]+" ");
     }
     
     }
     
     else{
     
     	System.out.println("WRONG INDEX GIVEN !!!!!!!!!!!!!!!!!!!!!!");	
     	
     }
     
   }
 }
  
 	
