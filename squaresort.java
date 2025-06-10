import java.util.Scanner;
import java.util.*;
public class squaresort{
  public static void displayarray(int arr[]){
    for (int i = 0 ; i<arr.length ; i++)
    System.out.print(arr[i]+" ");
  }
  public static void squatrsorts(int arr[]){
    int right = arr.length-1;
    int left = 0 ;
    int ans[] = new int[arr.length];
    int i = arr.length-1;
    while(left<=right){
      if(arr[left]*arr[left]>arr[right]*arr[right]){
         ans[i--] = arr[left]*arr[left];
         left++;
      }
       else if(arr[left]*arr[left]<arr[right]*arr[right]){
         ans[i--] = arr[right]*arr[right];
         right--;
      }
      else {
        ans[i] = arr[left]*arr[left];
        left++;
      }
    }
    displayarray(ans);
  }
  public static void main(String args[]){
    System.out.print("give the size of array :-");
    Scanner sc = new Scanner(System.in); 
    int arr[] = new int[sc.nextInt()];
    System.out.println("NEGATIVE INTEGERS ARE ALLOWED !");
    System.out.print("give elements in increasing order :-");
      for ( int i = 0 ; i < arr.length ; i++)
      arr[i] = sc.nextInt();
       squatrsorts(arr);
  }

}