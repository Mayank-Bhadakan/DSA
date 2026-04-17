package BubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int arr[] = {4,6,7,1,3,4,2,1,10,12,9};

        //here in bubble we have to assume first number is bubble and compare with next number if that number is lower than this number then swap
        // first loop 0 to length
        // second loop 0 to length-1-i     bcz. last element will be sort after first loop finish

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.print(Arrays.toString(arr));
    }
}
