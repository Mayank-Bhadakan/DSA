package String;

import java.util.Arrays;
import java.util.Scanner;

public class SortWords {
    // sheet no. 113 sort the words of the sentence
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        // her we have to first compare every words with next words if any words are smaller then replace with current words
        String arr[] = str.split(" ");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i].compareTo(arr[j]) < 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print(Arrays.toString(arr));
    }
}
