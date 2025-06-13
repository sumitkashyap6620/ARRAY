import java.util.Scanner;

public class spiralorderprint {
     public static void Display_matrix(int[][] arr){
    for (int i  = 0 ; i < arr.length ; i++){
    for(int j = 0 ; j < arr[i].length ; j++)
    System.out.print(arr[i][j]+" ");
    System.out.println();
}
}
public static void spiralorderprints(int arr[][]){
 int x = 0 ;
    int toprow = 0 ;
  int rightcol = arr[1].length-1;
  int bottomrow = arr.length-1;
  int leftcol = 0 ;
  while(x<arr.length*arr[1].length){
     /* print top row -> toprow to rightcol */
     for ( int i = leftcol ; i <= rightcol && x<arr.length*arr[1].length ; i++ ){
        System.out.print(arr[toprow][i]+" ");
        x++;
     }
     toprow++;
    /* print rightcol -> toprow to botom row  */
    for (int i = toprow ; i<=bottomrow && x<arr.length*arr[1].length ; i++){
     System.out.print( arr[i][rightcol]+" ");
     x++;
     }
     rightcol--;

    /* print botomrow -> rightcol to leftrow  */
    for (int i = rightcol; i>=leftcol && x<arr.length*arr[1].length ; i--){
     System.out.print( arr[bottomrow][i]+" ");
     x++;
     }
     bottomrow-- ;
     /* print leftcol -> botomrow to topcol  */
      for (int i = bottomrow; i>=toprow && x<arr.length*arr[1].length ; i--){
     System.out.print( arr[i][leftcol]+" ");
     x++;
     }
    leftcol++ ;
    }
}
public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    System.out.print("Creating matric\nRows :  ");
    int r = sc.nextInt(); 
    System.out.print("columns : ");
    int c = sc.nextInt(); 
    int arr[][] = new int[r][c];
    System.out.println("Give matrix :-");
      for (int i = 0 ; i < r ; i++)
          for (int j = 0 ; j < c ; j++)
           arr[i][j]=sc.nextInt();
           System.out.println("Given matrix is :-");
           Display_matrix(arr);
           System.out.println("spiral oder print :-");
           spiralorderprints(arr);
           sc.close();
}
}
