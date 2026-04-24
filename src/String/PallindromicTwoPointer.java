package String;

import java.util.Scanner;

public class PallindromicTwoPointer {
    // check a string is palindromic or not by using two pointer not use extra variable
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sting and check this is palindromic or not ");
        String str = sc.nextLine();

        // here use two pointer first start form 0 and second from end
        int l = 0;
        int r = str.length()-1;
        boolean palindromic = true;

        while(l<r){
            if(str.charAt(l) != str.charAt(r)){
                palindromic = false;
                break;
            }
            l++;
            r--;
        }

        if(palindromic) System.out.println("This string is palindromic");
        else System.out.println("This string is not palindromic");
    }
}
