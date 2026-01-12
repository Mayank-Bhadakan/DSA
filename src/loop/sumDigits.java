package loop;

import java.util.Scanner;

public class sumDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int length = String.valueOf(n).length();

        int sum = 0;

        for(int i=0; i<length; i++){
            sum = sum + (n%10); // get last one digit
        }
        System.out.println(sum);
    }
}
