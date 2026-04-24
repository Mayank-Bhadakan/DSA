package String;

import java.util.Scanner;

public class EachCharacterprint {
    // sheet no 101 Accept a string from the user and print its each character on a new line
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        for(int i=0; i<str.length(); i++){
            System.out.println(str.charAt(i));
        }
    }
}
