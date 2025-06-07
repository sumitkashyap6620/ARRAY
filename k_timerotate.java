import java.util.Scanner;
public class k_timerotate {
    public static void displayarray(int arr[]){
        for (int i = 0 ; i < arr.length ; i++)
          System.out.print(arr[i] + " ");
        }
    public static void reversearray(int arr[] , int f , int l ){
        for ( int i = f ; i < l ; i++ ){
            arr[l] = arr[i] + arr[l];
            arr[i] = arr[l] - arr[i];
            arr[l] = arr[l] - arr[i]; 
            l--;
        }
    } 
    public static void main(String[] args) {
      System.out.print("give the size of array :- "); 
      Scanner sc = new Scanner(System.in);
      int arr[] = new int[sc.nextInt()]; 
      System.out.println("Give elements :- ");
      for (int i = 0 ;  i < arr.length ; i++ )
      arr[i] = sc.nextInt();
      System.out.print("Give value how many times you want to rotate your array :- ");
      int k = sc.nextInt();
      reversearray(arr ,0 , arr.length - k+1 );
      reversearray(arr , arr.length-k  , arr.length-1 );
      reversearray(arr , 0  , arr.length-1 );
      displayarray(arr);
    }
}
