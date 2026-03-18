package Array;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        // here in Selection Sort we have to sort that arrays by using selection that means
        // first loop i 0 to n
        // second loop j = i+1 to n
        // compare i and j    if (i > j) then replace and j ++ check all the jth element with i element
        // once j element complete then i++ , and again check i with j th element;

        int arr[] = {8,2,1,5,9,4,16,8};

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
