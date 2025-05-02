
import java.util.Scanner ;
public class BinaryToDecimal {
    public static void IntoDecimal(int[] arr){
        int a = 0 ;
        int d = 0 ;
        for(int i = 0 ; i < arr.length ; i++){
           d = d + (int)(Math.pow(2,a)*arr[i]);
          a++ ;
        }
        System.out.print("Decimal No. = "+d);
    }
    public static void main(String[] args) {
      
            System.out.print(" GIVE THE SIZE OF BINARY DIGITS TO CONVERT INTO DECIMAL : ");
             Scanner sc = new Scanner (System.in);
             int[] arr = new int[sc.nextInt()];
             System.out.println("GIVE THE DIGITS :");
             for (int i = 0 ; i < arr.length ; i++)arr[i] = sc.nextInt();
             IntoDecimal(arr);
             sc.close();
        }
    }
