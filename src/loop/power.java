package loop;

import java.util.Scanner;

public class power {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        System.out.print("how many times you want to raised to the power of " + a + ": ");
        int b = sc.nextInt();

        int power = 1;

        for(int i=1; i<=b; i++){
            power *= a;
        }

        System.out.println(power);
    }
}
