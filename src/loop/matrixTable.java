package loop;

import java.util.Scanner;

public class matrixTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number which table you want: ");
        int n = sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println( n + " * " + i + " = " + (n*i));
        }
    }
}
