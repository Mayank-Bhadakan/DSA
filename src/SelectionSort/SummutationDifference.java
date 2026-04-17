package SelectionSort;

import java.util.Arrays;
import java.util.Scanner;

public class SummutationDifference {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,5,8};
        int sum = 0;

        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                sum += (arr[j] - arr[i]);
            }
        }

        System.out.print(sum);
    }
}
