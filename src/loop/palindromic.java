package loop;

import java.util.Scanner;

public class palindromic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int duplicate = n;

        int length = String.valueOf(n).length();
        String reverse = "";

        for(int i=0; i<length; i++){
            reverse = reverse + String.valueOf(n%10);
            n = n/10;
        }

        int value = Integer.parseInt(reverse);
        System.out.println(value);

        if(duplicate == value) System.out.println("Palindromic");
        else System.out.println("Not a Palindromic");

    }
}
