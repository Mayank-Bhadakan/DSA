package Array;

import java.util.Scanner;

public class StrongNumberMehtod {
    // find Strong number using method that means do code with using other funciton call the function in another funciton and call final in main code

    static int factorial(int n) {
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact *= i;
        }
        return fact;
    }

    static void strong(int number) {
        int sum = 0;
        int copy = number;

        while(number > 0){
            int def = number % 10;
            sum += factorial(def);
            number = number / 10;
        }
        if(sum == copy) System.out.println("It is a strong number");
        else System.out.println("It is not a strong number");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number; ");
        int n = sc.nextInt();
        strong(n);

    }
}
