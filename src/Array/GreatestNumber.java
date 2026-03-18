package Array;

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a size how much long array you want: ");
        int size = sc.nextInt();
        System.out.println("Now enter element one by one");

        int arr[] = new int[size];
        int greatest = 0;

        for(int i=0; i<size; i++){
            System.out.print("Enter a element: ");
            arr[i] = sc.nextInt();
        }

        for(int j=0; j<arr.length; j++){
            if(arr[greatest] < arr[j]){
                greatest = j;
            }
        }

        System.out.println("The greatest number is: " + arr[greatest] + " found at index no." + greatest );
    }
}
