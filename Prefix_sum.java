package ARRAY ;
import java.util.Scanner ;
public class Prefix_sum {
    public static void displayarray(int [] arr  ){
        for (int i = 0 ; i < arr.length ;i++ ) 
             System.out.print( +arr[i]+" ");
     }
     public static void prefixsum(int[] arr ){
      for (int i = 1 ; i < arr.length ; i++)
        arr[i] = arr[i-1] + arr[i];
       displayarray(arr);
     }
     public static void main(String[] args) {
        System.out.print(" GIVE THE SIZE OF ARRAY TO REVERSE : ");
         Scanner sc = new Scanner (System.in);
         int[] arr = new int[sc.nextInt()];
         System.out.println("give the elements :");
         for (int i = 0 ; i < arr.length ; i++)arr[i] = sc.nextInt();
        prefixsum(arr);
        sc.close();
        }
    }
