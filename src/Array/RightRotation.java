package Array;

import java.util.Arrays;
import java.util.Scanner;

public class RightRotation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int arr[] = {10,20,30,40,50,60};
        int temp = arr[arr.length-1];

        for(int i=arr.length-1; i>=1; i--){
            arr[i] = arr[i-1];
        }

        arr[0] = temp;

        System.out.println(Arrays.toString(arr));
    }
}
