package Array;

import java.util.Scanner;

public class checkIncreasing {
    // check this array is in increasing order or not
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        boolean increasing = true;

        System.out.println("Enter array elements: ");

        for(int i=0; i<size; i++){
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }

        for(int i=1; i<arr.length; i++){
            if(arr[i-1] > arr[i]){
                increasing = false;
                break;
            }
        }

        if(increasing){
            System.out.println("This array element is in increasing order");
        }
        else {
            System.out.println("This array element is not in increasing order");
        }
    }
}
