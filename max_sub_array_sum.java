import java.util.Scanner;
public class max_sub_array_sum{
    public static void maxsum(int[] arr){
        int maxsum=0;
        for(int i = 0 ; i < arr.length ; i++){
            
            for(int j = i ; j < arr.length ;j++ ){
                int current = 0 ;
               for(int k = i ; k <= j ; k++){
                System.out.print(arr[k]+",");
                current = current+arr[k] ; 
               }
               System.out.println();
               System.out.println("current sum = " + current);
               if(current>maxsum)maxsum=current;
            }
        }
        System.out.println("maximumsum = " + maxsum);
    }
public static void main(String[] args) {
    System.out.print("giv the length of array :- ");
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[sc.nextInt()] ;
    System.out.println("give elements :- ");
    for(int i = 0 ;  i < arr.length ; i++)
     arr[i] = sc.nextInt();
     maxsum(arr);
     sc.close();
}
}
