import java.util.Scanner;
public class EqualSumdivide{
   
     public static boolean equalsum(int arr[]){
      int total = 0;
      int prefix = 0 ;  
       for (int i = 0 ; i < arr.length ; i++ )
       total += arr[i];
        for (int i = 0 ; i < arr.length ; i++ ){
       prefix += arr[i];
       if(total-prefix ==prefix)return true;
        }
       return false;
    }
    public static void main(String[] args) {
        System.out.print("give length of array :");
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()+1];
        System.out.println("give elements:");
        for(int i = 1 ; i < arr.length ; i++)
        arr[i]=sc.nextInt();
        System.out.print("Is equal sum partetion is possible = "+equalsum(arr));
       
        
    }
}
