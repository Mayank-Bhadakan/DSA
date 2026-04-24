package String;

import java.util.Scanner;

public class WordPrefix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a array of string: ");
        String arr[] = new String[4];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextLine();
        }

        System.out.println("Enter a prefix: ");
        String prefix = sc.nextLine();
        int count = 0;

        for(int i=0; i<arr.length; i++){
            String word = arr[i];
            if(word.startsWith(prefix)) count++;
        }

        System.out.println(count + " words has this prefix");
    }
}
