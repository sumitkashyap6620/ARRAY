import java.util.Scanner;

public class pascalstriangle {
       public static void Display_matrix(int[][] arr){
    for (int i  = 0 ; i < arr.length ; i++){
    for(int j = 0 ; j < arr[i].length ; j++)
    System.out.print(arr[i][j]+" ");
    System.out.println();
}
}
    public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    System.out.print("for pasclas triangle give Rows :-  ");
    int r = sc.nextInt(); 
    int arr[][] = new int[r][];
    for (int i = 0 ; i < r ; i++  ){
        arr[i] = new int[i+1];
        arr[i][0] = 1;
        arr[i][i] = 1 ;
        for (int j = 1 ; j<i ; j++){
            arr[i][j] = arr[i-1][j]+arr[i-1][j-1];
        }
    }
    System.out.println("pascals triangle :-");
    Display_matrix(arr);
    sc.close();
}
}
