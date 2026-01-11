package loop;

import java.util.Scanner;

public class factors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number which you want to find a factors: ");
        int  n = sc.nextInt();

       for( int i = 1; i <= n/2; i++){
           if( n % i == 0) System.out.print(i + " ");
       }
       System.out.print(n);
    }
}
