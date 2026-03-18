package Array;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int arr[] = {2,3,6,8,9,12,15,18,19,20,34,35,67,89,99};
        int target = sc.nextInt();

        // here in Binary sort we have to find the target value by sing binary sort that means we havw to dins mid value then compare with target
        // if the target value is greater than mid value that means it will be on right side of the mid so just update start = mid + 1 and again compare
        // if the target value is smaller than mid value that means it will be on left side fo the mis so update end = mid - 1;
        // this loop continues while start <= end is true
        //calculate mid = start + (end - start)/2;
        // if not find that target value then return -1;

        int start = 0;
        int end = arr.length-1;
        int result = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target) {
                result = mid;
                break;
            }
            else if(arr[mid] < target) start = mid + 1;
            else end = mid - 1;
        }

        System.out.println("Element found at index " + result);
    }
}
