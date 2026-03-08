package loop;

import java.util.Scanner;

public class VPattern {
    public static void main(String[] args){
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter a number how many * you want to print V Pattern: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i-1; j++){
                System.out.print("  ");
            }
            System.out.print("*");
            for(int k=n; k>=i; k--){
                System.out.print("    ");
            }
            System.out.print(" * ");
            System.out.println();
        }
        for(int i=1; i<=n; i++){
            System.out.print("  ");
        }
        System.out.print(" * ");
    }
}
