package Array;

import java.util.Scanner;

public class secondGreatestNo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter the element of the array: ");

        for(int i=0; i<size; i++){
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }

        int greatest = Math.max(arr[0], arr[1]);
        int secondGreatest = Math.min(arr[0], arr[1]);

        for(int i=2; i<arr.length; i++){
            if(greatest < arr[i]){
                secondGreatest = greatest;
                greatest = arr[i];
            }
            else if( (secondGreatest < arr[i]) && (arr[i] != greatest) ){
                secondGreatest = arr[i];
            }
        }

        System.out.println("The greates no is: " + arr[greatest]);
        System.out.println("The SecondGreatest no is: " + arr[secondGreatest] + " found at index of: " + secondGreatest);
    }
}
