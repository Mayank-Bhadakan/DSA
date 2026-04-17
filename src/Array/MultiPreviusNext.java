package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiPreviusNext {
    // replace element with multiplication of previous and next element
    // first element replace with multiplication of itself and next element
    // last element replace with multiplication of itself and previous element

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int arr[] = {2,3,4,5,6};
        int num[] = new int[arr.length];

        num[0] = arr[0] * arr[1];
        num[arr.length-1] = arr[arr.length-1] * arr[arr.length-2];

        for(int i=1; i<arr.length-1; i++){
            num[i] = arr[i-1] * arr[i+1];
        }

        System.out.println(Arrays.toString(num));
    }
}
