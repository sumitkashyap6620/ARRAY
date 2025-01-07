package ARRAY;

import java.util.Scanner;

public class K_timesRotate {
    public static void displayarray(int [] arr ){
       for (int i = 0 ; i < arr.length ;i++ ) 
            System.out.print( +arr[i]+" ");
    }
    public static void K_timeRotate(int arr[] , int k ){
      int a = 0 ;
     while(k !=a ){
        int x = arr[arr.length-1];
        for (int i = arr.length-1; i > 0 ; i--)
         arr [i] = arr[i-1];
      arr[0] = x ;
    a++ ;
}
      displayarray(arr);
 } 
    public static void main(String[] args) {
        System.out.print(" GIVE THE SIZE OF ARRAY TO REVERSE : ");
         Scanner sc = new Scanner (System.in);
         int[] arr = new int[sc.nextInt()];
         System.out.println("give the elements :");
         for (int i = 0 ; i < arr.length ; i++)arr[i] = sc.nextInt();
         System.out.print("How many times you want to rotate : ") ;
        K_timeRotate(arr , sc.nextInt()%(arr.length));
         sc.close();
    }
}
