package Array;

import java.util.Scanner;

public class sumAveragearrya {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of element you want: ");
        int size = sc.nextInt();
        int sum = 0;
        int average = 0;

        int arr[] = new int[size];
        System.out.println("Now insert your element in array one by one: ");

        for(int i=0; i<size; i++){
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.println("The sum is: " + sum);
        average = sum / arr.length;
        System.out.println("The average is: " + average);

    }
}
