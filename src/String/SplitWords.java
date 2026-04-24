package String;

import java.util.Scanner;

public class SplitWords {
    // sheet no. 108 Accept the sentences and split it into words, print each words in a new line with first letter characterized
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        // always split() function return all the datas in array form so you have to initialize array
        String arr[] = str.split(" ");
        // now all words are separate after each space

        for(int i=0; i<arr.length; i++){
            String word = arr[i];
            char ch = word.charAt(0);               // every word's first charater target
            String ans = "";
            if(ch >= 'a' && ch <= 'z'){
                ans += (char)(ch - 32);
            }
            else {
                ans += ch;
            }
            System.out.println(ans + word.substring(1));
        }
    }
}
