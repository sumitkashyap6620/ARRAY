import java.util.Scanner;

public class SelectionSort {
     public static int[] Selectionsort(int arr[]){
      int min = 2545854 ;
      int[] ans = new int[arr.length-1];
      for(int i = 0 ; i < arr.length ; i++){
        if(arr[i] < min ) 
        min = arr[i] ;
        for (int j = i ; j < arr.length ; j++ ){
            if (arr[j] == min ) {
                arr[j] += arr[i] ;
                arr[i] = arr[j] - arr[i];
                arr[j] -= arr[i];
            }
        }
    }
    
    public static void main(String args[]){
    System.out.print("Give length of array : ");
   Scanner sc = new Scanner(System.in);
   int arr[] = new int[sc.nextInt()];
   System.out.println("Give elements :- ");
    for(int i = 0 ; i<arr.length ; i++)
    arr[i] = sc.nextInt();
    Selectionsort(arr);
    for(int i = 0 ; i < arr.length ; i++)
    System.out.print(arr[i]+" ");
  sc.close();
}
}
