package loop;

import java.util.Scanner;

public class palindromic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt(); // 123
        int duplicate = n;
        int rev = 0;

        while ( n > 0 ){
            int digit = n % 10;
            rev = (rev * 10) + digit;
            n = n / 10;
        }
        if( rev == duplicate) {
            System.out.println("The number is palindromic");
        }else System.out.println("The number is not palindromic");

    }
}
