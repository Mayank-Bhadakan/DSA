package Array;

import java.util.Scanner;

public class CopyINReverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a size for the array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the elements of the array: ");

        for(int i=0; i<arr.length; i++){
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }

        int copy[] = new int[size];
        int n = 0;

        for(int j=arr.length-1; j>=0; j--){
            copy[j] = arr[n];
            n++;
        }

        System.out.print("New reverse array is: ");

        for(int i=0; i<arr.length; i++){
            System.out.print(copy[i] + " ");
        }
    }
}
