import java.util.Scanner;
public class AllSubsets{
  public static void PrintSubsets(int arr[]){
   for (int i = 0 ; i < arr.length ; i++){
    System.out.print("{"+arr[i]+"} ");
   }
   System.out.println();
   for( int i = 0 ; i < arr.length ; i++ ){
    
    for (int j = i ; j < arr.length ; j++ ){
      System.out.print("{");
    for (int k = j ; k < arr.length ; k++ )
    System.out.print(arr[j]);
    }
    System.out.println("} ");
   }
   System.out.println();
  }
    public static void main (String args[]){
      System.out.print("Give length of array :"); 
      Scanner sc = new Scanner(System.in); 
      int arr[] = new int[sc.nextInt()];
      System.out.println("Give Elements");
      for(int i = 0 ; i < arr.length ; i++)
       arr[i] = sc.nextInt();
      PrintSubsets(arr);
    }
}