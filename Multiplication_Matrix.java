package ARRAY;

import java.util.Scanner;

public class Multiplication_Matrix {
  public static void Display_matrix(int[][] arr){
    for (int i  = 0 ; i < arr.length ; i++){
    for(int j = 0 ; j < arr[i].length ; j++)
    System.out.print(arr[i][j]+" ");
    System.out.println();
}
}
public static int[][] Multiplication(int[][]arr,int[][]arr2){
int[][] ans= new int[arr.length][arr2[0].length];
for (int i = 0 ; i < ans.length ; i++)
    for (int j = 0 ; j < ans[i].length ; j++)
      for(int k = 0 ; k < arr2.length ; k++)
        ans [i][j] += arr[i][k] * arr2[k][j] ;

return ans ;
}
  
    public static void main(String[] args) {
          System.out.print("Give the order of 1st Matrix :-\nRows :- ");
    Scanner sc = new Scanner(System.in);
   int r = sc.nextInt();
    System.out.print("columns :- ");
    int c = sc.nextInt();
    int[][] arr = new int [r][c];
    System.out.println("Give element of 1st Matrix :");
    for(int i = 0 ; i < r ; i++ )
    for(int j = 0 ; j < c ; j++ ) arr[i][j] = sc.nextInt();  
    System.out.print("Give the order of 2nd Matrix :-\nRows :- ");
   int r2 = sc.nextInt();
    System.out.print("columns :- ");
    int c2 = sc.nextInt();
    if(c != r2){
    System.out.println("Multiplication is not possible !");
   return ;
   
   }
    int[][] arr2 = new int [r2][c2];
   System.out.println("Give element of 2nd Matrix :");
    for(int i = 0 ; i < r2 ; i++ )
    for(int j = 0 ; j < c2 ; j++ ) 
    arr2[i][j] = sc.nextInt(); 
    System.out.println("Multiplication of tow matrix is :- ");
   Display_matrix(Multiplication(arr, arr2));
   sc.close();
}
}
