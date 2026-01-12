package loop;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter digits: ");
        int a = sc.nextInt();
        int length = String.valueOf(a).length();

        for(int i=0; i<length; i++){
            System.out.print( a % 10 );
            a = a / 10;
        }
    }
}
