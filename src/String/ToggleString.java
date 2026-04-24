package String;

import java.util.Scanner;

public class ToggleString {
    // Toggle String uppercase to lowercase and lowercase to uppercase
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String str = sc.nextLine();

        for(int i=0; i<str.length(); i++){
            // lowercase to uppercase
            int num = (int)str.charAt(i);
            if(num >= 97 && num <= 122 ){
                num = num - 32;
            }
            else if(num >= 65 && num <= 90){
                num = num + 32;
            }
            System.out.print((char)num);
        }
    }

}
