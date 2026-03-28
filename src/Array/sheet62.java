package Array;

import java.util.Scanner;

public class sheet62 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int arr[] = {1,3,4,6,9,12,4,10};
        System.out.println("Enter Number which number you want to find: ");

        int n = sc.nextInt();
        int index = -1;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == n){
                index = i;
                break;
            }
        }

        System.out.println("The index is: " + index);
    }
}
