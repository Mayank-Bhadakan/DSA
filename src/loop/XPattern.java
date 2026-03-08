package loop;

import java.util.Scanner;

public class XPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for(int i=1; i<=n/2; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int k=n/2; k>=i; k--){
                System.out.print("   ");
            }
            System.out.print("*");
            System.out.println();
        }

        for(int i=1; i<=n/2; i++){
            System.out.print("  ");
        }
        System.out.print("*");
        System.out.println();

        for(int i=n/2; i>=1; i--){
            for(int j=i; j>=1; j--){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int k=i; k<=n/2; k++){
                System.out.print("   ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
