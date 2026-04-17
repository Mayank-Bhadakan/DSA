package Array;

import java.util.Arrays;

public class Permutation {
    // ans must be like: nums[nums[i]];

    public static void main(String[] args){
        int arr[] = {0,2,1,5,3,4};
        int nums[] = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            nums[i] = arr[arr[i]];
        }

        System.out.print(Arrays.toString(nums));
    }
}
