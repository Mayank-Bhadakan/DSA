package String;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        int vowel = 0;
        int consonant = 0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            switch(ch){
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' :{
                    vowel++;
                    break;
                }
                default: consonant++;
            }
        }

        System.out.println("vowel : " + vowel);
        System.out.println("consonant : " + consonant);
    }
}
