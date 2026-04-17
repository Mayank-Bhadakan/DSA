package Array;

import java.util.Scanner;

public class SpecialNumberMethod {
    // ex: 2025 => 20 + 25 = 45
    //45 * 45 = 2025   this is special number;

    static int digits(int n){
        int digit = 0;
        while(n > 0){
            digit++;
            n = n/10;
        }
        return digit;
    }

    static void special(int number){
        int digit = digits(number);

        int left = number / (int)Math.pow(10, (digit - digit / 2));
        int right = number % (int)Math.pow(10, (digit - digit / 2));

        System.out.println(left + " " + right);
        int sum = (int)(left + right);
        long factorial = sum * sum;

        if(factorial == number) System.out.println("it is special number");
        else System.out.println("it is not special number");

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();

        special(n);
    }
}
