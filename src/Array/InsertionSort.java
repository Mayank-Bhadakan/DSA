package Array;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // in Insertion Sort Array: suppose one element on left side is sort and all are other right side elements are unsort so we have to move on left side
        // which element is sort
        // e.x.:  8,2,1,5,12,9,27,16
        // here 8 is sort then unsort elements are 2 to 16
        // 8 = j  ( j = i - 1)
        // i start from 1 that means i = 2;    store in one variable key = arr[i]
        // condition if j>=0 && key < arr[j] then replace

        int arr[] = {8,2,1,5,12,9,27,16};

        for(int i=1; i<arr.length-1; i++){
            int key = arr[i];
            int j = i-1;

            while(j>=0 && key < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        System.out.println(Arrays.toString(arr));

    }
}
