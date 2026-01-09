package loop;

import java.util.Scanner;

public class nTimeprint {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number how many time you want to print: ");
        int n = sc.nextInt();

        for( int i=0; i < n; i++ ){
            System.out.println("Hello World");
        }
    }
}
