package Array;

import java.util.Scanner;

public class StrongNumber {
    //Strong number find by using methods that means don't write all the code inside of main method
    // create different type of method and then write code and call in main

    static int factorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact *= i;
        }
        return fact;
    }

    static void strong(int number){
        int sum = 0;
        int temp = number;

        while(number > 0){
            int def = number % 10;
            sum += factorial(def);
            number = number / 10;
        }

        if(sum == temp) System.out.println("This number is a Strong Number");
        else System.out.println("This is not a Strong number");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        strong(n);

    }
}
