import java.util.Scanner;
public class multiplication{
    public static void displaymatrix(int arr[][]) {
      for (int i = 0 ; i < arr.length ; i++){
          for (int j = 0 ; j < arr[i].length ; j++){
           System.out.print(arr[i][j]+" ");
      }
      System.out.println();
      }
    }
    public static void mul(int arr1[][] , int r1 , int c1 , int arr2[][] , int r2 , int c2){
      if( c1 != r2 ){
        System.out.println("WRONG INPUT !");
        return;
      }
      int Mul[][] = new int[r1][c2];
      for (int i = 0 ; i < r1 ; i++ ){
         for (int j = 0 ; j < c2 ; j++ ){
           for (int k = 0 ; k < r2 ; k++ ){
              Mul[i][j] = Mul[i][j] + arr1[i][k]*arr2[k][j];
           }
      }
      }
        displaymatrix(Mul);
    }
public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    System.out.print("Creating 1st matric\nRows :  ");
    int r1 = sc.nextInt(); 
    System.out.print("columns : ");
    int c1 = sc.nextInt(); 
    int arr1[][] = new int[r1][c1];
      for (int i = 0 ; i < r1 ; i++)
          for (int j = 0 ; j < c1 ; j++)
           arr1[i][j]=sc.nextInt();
      System.out.print("Creating 2nd matric\nRows :  ");
    int r2 = sc.nextInt(); 
    System.out.print("columns : ");
    int c2 = sc.nextInt(); 
    int arr2[][] = new int[r2][c2];
      for (int i = 0 ; i < r2 ; i++)
          for (int j = 0 ; j < c2 ; j++)
           arr2[i][j]=sc.nextInt();
           System.out.println("First array :- ");
    displaymatrix(arr1);
     System.out.println("Second array :- ");
    displaymatrix(arr2);
    System.out.println("multiplication of arrays :-");
           mul(arr1, r1, c1, arr2, r2, c2);
}
}