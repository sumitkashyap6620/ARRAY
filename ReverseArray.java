

import java.util.Scanner;
public class ReverseArray{

    public static void displayarray(int [] arr ){
        System.out.println("Reversed array :- ");
        for (int i = 0 ; i < arr.length ;i++ ) {
            System.out.print( +arr[i]+" ");
        }
    }
  
    public static void reverse(int[] arr , int Bind , int Eind ){
        while(Bind < Eind){
         arr[Bind] = arr[Bind] + arr[Eind] ;
         arr[Eind] = arr[Bind] - arr[Eind] ;
         arr[Bind] = arr[Bind] - arr[Eind] ; 
         Bind ++ ;
         Eind -- ;
        }
        displayarray(arr);
    }
    public static void main(String[] args) {
        System.out.print(" GIVE THE SIZE OF ARRAY TO REVERSE : ");
         Scanner sc = new Scanner (System.in);
         int[] arr = new int[sc.nextInt()];
         System.out.println("give the elements :");
         for (int i = 0 ; i < arr.length ; i++)arr[i] = sc.nextInt();
         reverse(arr,0,arr.length-1);
         sc.close();
    }
}