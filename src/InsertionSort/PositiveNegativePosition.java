package InsertionSort;

import java.util.Arrays;
import java.util.Scanner;

public class PositiveNegativePosition {
    // here we are not able to use insertion sort because in track Sheet no.65 they require o(n)
    // we should have to use two Pointer method like start from first side and last side

    public static void main(String[] args){

        int arr[] = {5,8,-2,-1,7,-5,-2,9,1,2,-4};

       // Two Pointer method;
        int left = 0;
        int right = arr.length-1;

        while(left <= right ){
            if(arr[left] < 0){
                left++;
            }
            else if(arr[right] >= 0) {
                right--;
            }
            else{
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        System.out.print(Arrays.toString(arr));

    }
}
