package String;

import java.util.Arrays;
import java.util.Scanner;

public class SplitwithCapital {
    //sheet no.109 Split the sentence words with space and capitalize first and last character
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        String arr[] = str.split(" ");

        for(int i=0; i<arr.length; i++){
            String word = arr[i];
            String ans = "";

            char first = word.charAt(0);
            char last = word.charAt(word.length() - 1);

            if(first >= 'a' && first <= 'z'){
                first = (char) (first - 32);
            }

            if(word.length() <= 2) {
                if (last >= 'a' && last <= 'z') {
                    last = (char) (last - 32);
                }
            }

            if(word.length() <= 1) ans += first;
            else if(word.length() <= 2) ans += "" + first + last;
            else {
                ans += first + word.substring(1, word.length()-1) + last;
            }

            System.out.println(ans);
        }
    }
}
