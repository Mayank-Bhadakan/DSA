package loop;

import java.util.Scanner;

public class numberGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Generate Random number
        int random = (int)((Math.random() * 100) + 1);
        int n ;

        do {
            System.out.println("Enter a random from 1 to 100: ");
            n = sc.nextInt();

            if( n > random) System.out.println("Your expected number is too high");
            else if( n < random) System.out.println("Your expected number is too low");
            else System.out.println("Your number was " + n + " is exactely match with random number of " + random);

        }while(n != random);
    }
}
