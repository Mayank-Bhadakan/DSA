package String;

import java.util.Scanner;

public class FrequencyOfCharacter {
    // sheet no. 111 Accept a string and print the frequency of each character present in the string
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        // create 0th value array which length is 128
        // add +1 in that element index which index is equal to the character ASCII code
        int arr[] = new int[128];
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            arr[ch] = arr[ch] + 1;
        }
        // check how many arr element has more than 0 frequency
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0) System.out.println((char)i + " - " + arr[i]);
        }


    }
}
