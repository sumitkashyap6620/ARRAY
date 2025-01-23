package ARRAY;
import java.util.Scanner;
public class Rotation_90_Degree {
    public static void Display_matrix(int[][] arr){
        for (int i  = 0 ; i < arr.length ; i++){
        for(int j = 0 ; j < arr[i].length ; j++)
        System.out.print(arr[i][j]+" ");
        System.out.println();
    }
    }
    public static int[][] transpose(int arr[][]){
        int[][] ans = new int[arr.length][arr[0].length];
        for(int i = 0 ; i < arr.length ; i++)
        for(int j = 0 ; j < arr[0].length ; j++ ){
          ans[i][j] = arr[j][i];
        }
        return ans ;
    }
    public static void rotate(int[][] arr){
       arr = transpose(arr);
       for(int i = 0 ; i < arr.length ; i++){
        int t = arr.length-1;
         int[] temp = new int[arr[0].length];
         for(int k = 0 ; k < temp.length ; k++){
            temp[k] = arr[i][t];
            t--;
         }
         for(int j = 0 ; j < arr[0].length ; j++)
         arr[i][j] = temp[j];
        
       }
    Display_matrix(arr);
    }
    public static void main(String[] args) {  
    System.out.print("Give the order of Matrix :-\nRows :- ");
    Scanner sc = new Scanner(System.in);
   int r = sc.nextInt();
    System.out.print("columns :- ");
    int c = sc.nextInt();
    int[][] arr = new int [r][c];
    System.out.println("Give element of Matrix :");
    for(int i = 0 ; i < r ; i++ )
    for(int j = 0 ; j < c ; j++ ) arr[i][j] = sc.nextInt();
    System.out.println("given array is :");
    Display_matrix(arr);
    System.out.println("rotated array is :");
    rotate(arr);
    sc.close();
}
  
}
