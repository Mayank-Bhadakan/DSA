package loop;

import java.util.Scanner;

public class PrimeNumber2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n <= 1) System.out.println("Not Prime");
        else {
            for (int i=2; i<=(int)Math.sqrt(n); i++){
                if(n%i == 0) {
                    System.out.println("Not Prime");
                }
                else System.out.println("Prime");
            }
        }
    }
}
