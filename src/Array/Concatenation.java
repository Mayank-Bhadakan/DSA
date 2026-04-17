package Array;

import java.util.Arrays;

public class Concatenation {
    public static void main(String[] args){
        int arr[] = {1,4,9,8,4,5};

        int num[] = new int[2*arr.length];

        for(int i=0; i<arr.length; i++){
            num[i] = arr[i];
            num[arr.length + i] = arr[i];
        }

        System.out.print(Arrays.toString(num));
    }
}
