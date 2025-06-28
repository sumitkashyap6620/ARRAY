import java.util.Scanner;
public class bitmanipulation{
     public static void main (String args[]){
       Scanner sc = new Scanner(System.in);
          System.out.print("give any number to get,set,clear bit at any position :-");
          int n = sc.nextInt();
          System.out.print("give position :-");
          int p = sc.nextInt();
         int bitmas = 1 << p ;
         //get bit ........................................
        
        if((n & bitmas) == 0)
          System.out.println("Bit was 0 ");
         else
          System.out.println("Bit was 1 ");
        sc.close();

        //setbit ...........................................
        
        System.out.println((bitmas | n));
        
        //clear bit ........................................
        int notbitmas = ~bitmas ;
        System.out.println(notbitmas & n);
        System.out.println(5/2);
         sc.close();
      }
}