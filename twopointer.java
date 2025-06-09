// this programe will seprate even integers on the left side of array and odd integers on the right side of the array
// negative integers not allowed !
import java.util.Scanner;
public class twopointer {
    public static void dispayarray(int arr[]){
        for (int i = 0 ;  i < arr.length ; i++)
    System.out.print(arr[i]+" ");
    
    }
    public static void twopointers(int arr[]){
        int left = 0 ;
        int right = arr.length - 1 ; 
        while(right > left ){
            if(arr[left]%2==0)left++;
            if(arr[right]%2==1)right--;
            if(arr[left]%2==1 && arr[right]%2==0){
                arr[left]=arr[left]+arr[right];
                arr[right]=arr[left]-arr[right];
                arr[left]=arr[left]-arr[right];
                left++;
                right--;
            }
        }
        dispayarray(arr);
    } 
        public static void main(String[] args) {
         System.out.print("Give size of array : ");
      Scanner sc = new Scanner(System.in);
      int[] arr = new int[sc.nextInt()];
      System.out.println("NEGATIVE INTEGERS NOT ALLOWED !");
      System.out.print("Give elements :- "); 
       for (int i = 0 ; i < arr.length ;i++)
       arr[i] = sc.nextInt();
       twopointers(arr);
       System.out.println();
       dispayarray(arr);
    }
}
