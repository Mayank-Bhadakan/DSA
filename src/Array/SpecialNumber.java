package Array;

// special number using method
// suppose number is: 2025
// divide in two part 20 and 25 then => then sum both 20 + 25 => 45
// sqr that number 45 => 45 * 45 => 2025
// compare that number with the result is equal then this is a special number

import java.util.Scanner;

public class SpecialNumber {

    static int divide(int n){
        int digit = 0;
        int copy = n;
        while(n > 0){
            digit ++;
            n /= 10;
        }
        int leftDigit = digit / 2;
        int rightDigit = digit - (digit / 2);

//        int left = copy / (int) Math.pow(10,leftDigit);
//        int right = copy / (int) Math.pow(10, rightDigit);

        int right = copy % (int) Math.pow(10, rightDigit);
        int left = copy / (int) Math.pow(10, rightDigit);

        System.out.print(digit + " " + left + " " + right + " ");

        int sum  = left + right;
        int squr = sum * sum;
        return squr;
    }

    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int ans = divide(n);

        System.out.println(ans);

        if(n == ans){
            System.out.print(n + " is a special number");
        }
        else{
            System.out.print(n + " is not a special number");
        }


    }

}
