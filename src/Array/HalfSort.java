package Array;

import java.util.Arrays;
import java.util.Scanner;

public class HalfSort {
    // Sheet no. 76 sort half in ascending order and second half in descending order
    // first we divide in two parts left and right
    // in left side we do sort and merge in ascending order
    // in right side we do sort and merge in descending order

    static void lsort(int[] arr, int left, int right){
        if(left < right){
            int mid = (left + right) / 2;

            lsort(arr, left, mid);
            lsort(arr, mid+1, right);

            lmerge(arr, left, mid, right);
        }
    }

    // left side merge for ascending order
    static void lmerge(int[] arr, int left, int mid, int right){
        int l = left;
        int r = right;
        int j = mid + 1;
        int k = 0;
        int temp[] = new int[r - l + 1];

        while(l <= mid && j <= r){
            if(arr[l] <= arr[j]){
                temp[k++] = arr[l++];
            }
            else temp[k++] = arr[j++];
        }

        while(l <= mid){
            temp[k++] = arr[l++];
        }
        while(j <= r){
            temp[k++] = arr[j++];
        }

        for(int x=0; x<temp.length; x++){
            arr[left + x] = temp[x];
        }
    }

    static void rsort(int[] arr, int left, int right){
        if(left < right){
            int mid = (left + right) / 2;

            rsort(arr, left, mid);
            rsort(arr, mid+1, right);

            rmerge(arr, left, mid, right);
        }
    }

    // right side merge sort for descending order
    static void rmerge(int[] arr, int left, int mid, int right){
        int l = left;
        int r = right;
        int j = mid + 1;
        int k = 0;
        int temp[] = new int[r - l + 1];

        while(l <= mid && j <= r){
            if(arr[l] <= arr[j]){
                temp[k++] = arr[j++];
            }
            else temp[k++] = arr[l++];
        }

        while(l <= mid) {
            temp[k++] = arr[l++];
        }
        while(j <= r){
            temp[k++] = arr[j++];
        }

        for(int x=0; x<temp.length; x++){
            arr[left + x] = temp[x];
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int arr[] = {8, 3, 5, 7, 6, 2};
        int mid = (0 + (arr.length-1)) / 2;

        lsort(arr, 0, mid);
        rsort(arr, mid+1, arr.length-1);

        System.out.print(Arrays.toString(arr));
    }
}
