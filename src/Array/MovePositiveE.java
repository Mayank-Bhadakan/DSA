package Array;

import java.util.Arrays;

public class MovePositiveE {
    public static void main(String[] args){
        // move all the positive elements on the left side and negative elements on the right side
        int arr[] = {1,1,0,1,0,0,1,1,0};

        for(int i=1; i<arr.length; i++){
            int key = arr[i];
            int j = i - 1;

            while(j>=0 && key == 0){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        System.out.println(Arrays.toString(arr));
    }
}
