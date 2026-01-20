package loop;

import java.util.Scanner;

public class separateDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt(); // 123

        while ( n > 0 ){
            int digit = n % 10;
            System.out.println(digit);
            n = n / 10;
        }
    }
}
