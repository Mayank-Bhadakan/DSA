package String;

import java.util.Scanner;

public class AnagramString {
    // 112 Check Two Strings are Anagram or Not (Anagrams words have the same word length & same character count. Eamples of anagram words are arc and car, state and taste, night and thing etc.)
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first String: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second String: ");
        String str2 = sc.nextLine();
        boolean isAnagram = true;

        if(str1.length() != str2.length()) {
            isAnagram = false;
        } else {
            // create array which has default 0 value in every element
            // during checking first string add +1 every time when index is equal to the character ASCII code
            // during checking second string minus -1 in every time when index is equal to the character ASCII code
            // then compare if th array value is 0 then it is Anagram because in first string we add +1 and in second String we minus -1 it will total 0

            int arr[] = new int[128];
            // add +1 when first string has ASCII value in
            for(int i=0; i<str1.length(); i++) {
                char ch = str1.charAt(i);
                arr[ch] = arr[ch] + 1;
            }

            // minus -1 when second string has ASCII value
            for(int i=0; i<str2.length(); i++){
                char ch = str2.charAt(i);
                arr[ch] = arr[ch] - 1;
            }

            for(int i=0;  i<arr.length; i++){
                if(arr[i] > 0){
                    isAnagram = false;
                    break;
                }
            }
        }

        if(isAnagram) System.out.println(str1 + " & " + str2 + " is Anagram String");
        else System.out.println(str1 + " & " + str2 + " is not Anagram String");
    }

}
