
import java.util.Scanner ;
public class Sum_In_Range {
    public static void displayarray(int [] arr ){
        System.out.println("now array is :- ");
        for (int i = 0 ; i < arr.length ;i++ ) {
            System.out.print( +arr[i]+" ");
        }
    }
    public static int[] PrefixSum(int[] arr ){
        int[] ans = new int[arr.length];
        ans [0] = arr [0];
        for (int i = 1 ; i < arr.length ; i++)
        ans[i] = arr[i] + ans[i-1] ;
        return ans ;
    } 
    public static int SumInRange(int[] arr , int l , int r ){
           int[] ans = PrefixSum(arr);
           if(l==0 )return ans[r];
           return ans[r] - ans[l-1]; 
    } 
    public static void main(String[] args) {
        System.out.print("Give the size of array :- ");
        Scanner sc = new Scanner (System.in);
        int[] arr = new int [sc.nextInt()];
        System.out.print("Give elements :- "); 
       for (int i = 0 ; i < arr.length ;i++)
       arr[i] = sc.nextInt();
       System.out.print("Give range ! \n give the index first :- ");
       int l = sc.nextInt();
       System.out.print("give the index second :- ");
       int r = sc.nextInt(); 
      System.out.print("sum between given range = "+SumInRange(arr,l,r));
       sc.close ();
    }
}
