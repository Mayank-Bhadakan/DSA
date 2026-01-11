package loop;

import java.util.Scanner;

public class sumofFactors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number which you want a sum of all factors: ");
        int n = sc.nextInt();
        double sum = 0;

        for(int i=1; i<=n/2; i++){
           if( n % i == 0 ) {
               System.out.print( i + " ");
               sum += i;
           }
        }
        System.out.println(n);
        System.out.println("Sum of all factors is : " + (sum + n));
    }
}
