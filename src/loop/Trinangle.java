package loop;

import java.util.Scanner;

public class Trinangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number how many * pyramids you want: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(" *  ");
            }
            System.out.println();;
        }
    }
}
