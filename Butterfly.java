import java.util.Scanner;

public class Butterfly {
    public static void displayarray(char [] arr ){
        for (int i = 0 ; i < arr.length ;i++ ) 
             System.out.print( arr[i]+" ");
     }
     public static void main(String[] args) {
        System.out.print(" GIVE THE SIZE OF ARRAY TO REVERSE : ");
         Scanner sc = new Scanner (System.in);
         char[] arr = new char[sc.nextInt()];
         for(int i = 0 ; i < arr.length  ; i++)arr[i] = ' ' ;
         int i = 0 ;
         int j = arr.length ;
         for(i = 0 ; i <= j ; i++){
           int p = j-1 ;
            for(int k = 0; k < i ; k++){
              if (k<p){
                arr[k] = '*';
                arr[p] = '*';
                  p-- ;
            }
            else {
              arr[p] = ' ';
              arr[k] = ' ';
              p-- ; 
            }
        }displayarray(arr);
        System.out.println();
   sc.close(); }
}
}