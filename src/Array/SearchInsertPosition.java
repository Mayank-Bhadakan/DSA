package Array;

import java.util.Scanner;

public class SearchInsertPosition {
    public static void main(String[] args){
//        35. Search Insert Position
//        Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
//
//        Example 1:
//
//        Input: nums = [1,3,5,6], target = 2
//        Output: 1

        Scanner sc = new Scanner(System.in);

        int arr[] = {1,2,4,6,8,9,10,12,15,16,17,19,22,28};
        int target = sc.nextInt();

        int start = 0;
        int end = arr.length-1;
        int mid = 0;

        while(start <= end){
            mid = start + (end - start)/2;
            if(arr[mid] == target) break;
            else if(arr[mid] < target) start = mid + 1;
            else end = mid - 1;
        }

        if(target == arr[mid]) System.out.println(mid);
        else if(arr[mid] > target) System.out.println(mid);
        else System.out.println(mid + 1);


    }
}
