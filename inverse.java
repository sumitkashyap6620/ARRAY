import java.util.Scanner;
public class inverse{
public static void main(String args[]){

System.out.print("give length of array");
Scanner sc = new Scanner(System.in);
int arr[]  = new int[sc.nextInt()];
System.out.println("give elements");
for ( int i = 0 ; i <arr.length ; i++)
arr[i] = sc.nextInt();
for(int i = 0 ; i <arr.length /2 ; i++){
arr[i] = arr[arr.length-(i+1)] + arr[i];
arr[arr.length-(i+1)] = arr[i] - arr[arr.length-(i+1)];
arr[i] = arr[i] - arr[arr.length-(i+1)];
 }
System.out.println("reversed array is :");
for (int i = 0 ; i < arr.length ; i++)
System.out.print(arr[i]);
}
}

