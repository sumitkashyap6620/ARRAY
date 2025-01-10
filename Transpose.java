package ARRAY;
import java.util.Scanner ;
public class Transpose {
    public static void Display_matrix(int[][] arr){
        for (int i  = 0 ; i < arr.length ; i++){
        for(int j = 0 ; j < arr[i].length ; j++)
        System.out.print(arr[i][j]+" ");
        System.out.println();
    }
    }
    public static int[][] transpose(int[][] arr){
      int[][] ans = new int[arr[0].length][arr.length];
     for(int i = 0 ; i < ans.length ; i++)
     for(int j = 0 ; j < ans[0].length ; j++ )
     ans[i][j] = arr[j][i];
      return ans ;
    }
    public static int[][] transpose2(int[][] arr ){
        for(int i = 0 ; i < arr.length ; i++)
        for(int j = 0 ; j < i ; j++){
        arr[i][j] = arr[i][j] + arr[j][i] ;
        arr[j][i] = arr[i][j] - arr[j][i] ;
        arr[i][j] = arr[i][j] - arr[j][i] ;
        }
        return arr ;
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
    System.out.println("Transpose Of Given Matrix is :-"); 
    Display_matrix(transpose(arr));
    System.out.println("Transpose Of Given Matrix Without Using Extra Space :-"); 
    Display_matrix(transpose2(arr));
}
}