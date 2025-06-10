import java.util.Scanner;
public class sumLtoR {
    public static void displayarray(int arr[]){
    for (int i = 0 ; i<arr.length ; i++)System.out.print(arr[i]+" ");
    }
    public static void prefix(int arr[]){
        for(int i = 2 ; i<arr.length ; i++)
        arr[i] = arr[i] + arr[i-1];

    }

    
    public static int Lt0R(int arr[],int l , int r){
     prefix(arr);

    }
    public static void main(String[] args) {
        System.out.print("give length of array :");
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[sc.nextInt()];
        System.out.println("give elements:");
        for(int i = 1 ; i <= arr.length ; i++)
        arr[i]=sc.nextInt();
        int x=0;
        do{
            System.out.println("Give range to find out sum in range !");
            System.out.print("L = ");
            int L = sc.nextInt();
            System.out.print("R = ");
            int R = sc.nextInt();
           System.out.println(Lt0R(arr,L,R));
        System.out.print("to find other sum in range press 1 : ");
         x = sc.nextInt();
        }while(x==1);
        
    }
}
