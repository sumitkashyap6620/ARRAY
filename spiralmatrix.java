
    import java.util.Scanner;

public class spiralmatrix {
     public static void Display_matrix(int[][] arr){
    for (int i  = 0 ; i < arr.length ; i++){
    for(int j = 0 ; j < arr[i].length ; j++)
    System.out.print(arr[i][j]+" ");
    System.out.println();
}
}
public static void spiralorderprints(int arr[][]){
 int x = 1 ;
    int toprow = 0 ;
  int rightcol = arr[1].length-1;
  int bottomrow = arr.length-1;
  int leftcol = 0 ;
  while(x<=arr.length*arr[1].length){
     /* for top row -> toprow to rightcol */
     for ( int i = leftcol ; i <= rightcol && x<=arr.length*arr[1].length ; i++ ){
      arr[toprow][i] = x++;
        }
     toprow++;
    /* for rightcol -> toprow to botom row  */
    for (int i = toprow ; i<=bottomrow && x<=arr.length*arr[1].length ; i++){
        arr[i][rightcol] = x++;
     }
     rightcol--;

    /* for botomrow -> rightcol to leftrow  */
    for (int i = rightcol; i>=leftcol && x<=arr.length*arr[1].length ; i--){
      arr[bottomrow][i] = x++;
     }
     bottomrow-- ;
     /* for leftcol -> botomrow to topcol  */
      for (int i = bottomrow; i>=toprow && x<=arr.length*arr[1].length ; i--){
      arr[i][leftcol] =  x++;
    }
    leftcol++ ;

    }
    Display_matrix(arr);
}
public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    System.out.print("for spiral matrix give detail \nRows :  ");
    int r = sc.nextInt(); 
    System.out.print("columns : ");
    int c = sc.nextInt(); 
    int arr[][] = new int[r][c];
           System.out.println("spiral oder matrix is :-");
           spiralorderprints(arr);
           sc.close();
}
}


