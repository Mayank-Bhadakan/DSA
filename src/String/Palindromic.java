package String;

import java.util.Scanner;

public class Palindromic {
    // check if the string is palindromic or not that means that string in backword and front side both are same like: malayalam
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String and check this string is palindromic or not: ");
        String str = sc.nextLine();

        String reverse  = "";

        for(int i=str.length()-1; i>=0; i--){
            reverse = reverse + str.charAt(i);
        }

        if(str.equals(reverse)) {
            System.out.println("This string is palindromic");
        }
        else System.out.println("This string is not palindromic");
    }
}
