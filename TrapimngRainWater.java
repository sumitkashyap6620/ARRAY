import java.util.Scanner ;
public class TrapimngRainWater {
    public static int TrapedWater(int arr[]){
        int max = 0 ;
        int max2 = 0 ;
        int trapedwater = 0 ;
      for(int i = 1 ; i < arr.length-1 ; i++){
        for(int j = 0 ; j < i ; j++){
           if (j==0) max = arr[j] ;
           else
            if(arr[j] > max  ) max = arr[j] ;
           }
        for(int j = arr.length-1 ; j > i  ; j--){
            if (j == arr.length-1) max2 = arr[j] ;
            else
             if(arr[j] > max2  ) max2 = arr[j] ;
         }
         if(max <= max2 && arr[i] < max )
            trapedwater = trapedwater + max-arr[i] ;
         
         else if(max2<=max && arr[i] < max2 )
            trapedwater = trapedwater + max2-arr[i] ;
         
      }
      return trapedwater ;
    }
    public static void main(String[] args) {
     System.out.print("Give length of array : ") ; 
      Scanner sc = new Scanner(System.in);
     int arr[]= new int[sc.nextInt()]; 
     System.out.println("Give all elements :") ;
     for(int i = 0 ; i < arr.length ; i++ )
          arr[i] = sc.nextInt() ;
     System.out.println(TrapedWater(arr)) ;
     sc.close();
    }
}
