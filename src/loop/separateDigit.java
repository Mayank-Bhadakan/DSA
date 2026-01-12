package loop;

import java.util.Scanner;

public class separateDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt(); // 123
        int length = String.valueOf(n).length();

        for(int i=0; i<length; i++){
            System.out.println(n % 10); // 3
            n = n/10; //12
        }
    }
}
