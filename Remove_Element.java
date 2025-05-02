
import java.util.Scanner;
public class Remove_Element {
    public static void removeElement(int[] nums, int val) {
       
        for (int i = 0 ; i < nums.length ; i++){
            if ( nums[i] == val ){
               
                nums[i] = Integer.MIN_VALUE ;
                       
            }}
         System.out.println("now array is :-");   
        for (int i = 0 ; i < nums.length ; i++)
            if (nums[i] > Integer.MIN_VALUE)System.out.print(nums[i]+" ");
             
    
}  
    public static void main(String[] args){
                                                                                                                                                                                                                                                                                                                                                                                                                             
    System.out.print("Give the length of array : ");
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int[] arr = new int [x];
    System.out.print("Give element of array :");
    for(int i = 0 ; i < x ; i++ ) arr[i] = sc.nextInt();
    System.out.print("Give element to remove fron array :");
    int y = sc.nextInt();
     removeElement(arr , y);
    
  sc.close();
}}