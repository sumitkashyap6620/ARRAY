import java.util.Scanner;
public class max_sub_array_sum{
public static void main(String[] args) {
    System.out.print("giv the length of array :- ");
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[sc.nextInt()] ;
    System.out.println("give elements :- ");
    for(int i = 0 ;  i < arr.length ; i++)
     arr[i] = sc.nextInt();
}
}
