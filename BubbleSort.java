import java.util.Scanner ;
public class BubbleSort {
    public static int[] Bubblesort(int arr[]){
       for(int i = 0 ; i < arr.length-1 ; i++){
        for(int j = 1; j < arr.length-i ; j++){
        if (arr[j-1] > arr[j]){
            arr[j-1] += arr[j] ;
            arr[j] = arr[j-1] - arr[j];
            arr[j-1] -= arr[j];
        }
        }
       }return arr;
    }
    public static void main(String args[]){
    System.out.print("Give length of array : ");
   Scanner sc = new Scanner(System.in);
   int arr[] = new int[sc.nextInt()];
   System.out.println("Give elements :- ");
    for(int i = 0 ; i<arr.length ; i++)
    arr[i] = sc.nextInt();
    int[] a = Bubblesort(arr);
    for(int i = 0 ; i < a.length ; i++)
    System.out.print(a[i]+" ");
   
    sc.close();
}
   
}
