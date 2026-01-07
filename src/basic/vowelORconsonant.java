package basic;

import java.util.Scanner;

public class vowelORconsonant {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                System.out.println("This is vowel.");
            }else System.out.println("This is consonant");
        } else System.out.println("invalid input");
    }
}
