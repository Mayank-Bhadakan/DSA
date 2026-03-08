package loop;

import java.util.Scanner;

public class RAlphabetPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number how many alphabets you want: ");
        int n = sc.nextInt();

        for(int i=97; i<=(97+n); i++){
            for(int j=97; j<=i; j++){
                System.out.print((char) (j) + " ");
            }
            System.out.println();
        }
    }
}
