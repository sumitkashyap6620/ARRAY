package ARRAY;
import java.util.Scanner ;
public class Target_Sum {
    public static void targetsum (int[] arr , int t){
     for(int i = 0 ; i < arr.length ; i++){
        for (int j = i+1 ; j < arr.length ; j++)
        if (arr[i] + arr[j] == t){
            System.out.println(arr[i]+" , "+arr[j]+"   At indexes ["+i+"] "+"["+j+"]");
        }
     }
    }
    public static void main(String[] args) {
        System.out.print("Give size of array : ");
      Scanner sc = new Scanner(System.in);
      int[] arr = new int[sc.nextInt()];
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          System.out.print("Give elements :"); 
                                                                                                            for(int i = 0 ; i < arr.length ; i++)arr[i] = sc.nextInt();
  System.out.println("give target");
   int x = sc.nextInt();
   targetsum(arr,x);  
   sc.close();  
}
    
}


