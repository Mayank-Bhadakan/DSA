package Array;

import java.util.Arrays;

public class MergeSort {

    static void merge(int[] arr, int left, int mid, int right){
        int l = left;
        int r = right;

        int[] temp = new int[ r - l + 1];
        int j = mid + 1;
        int k = 0;
        while(l <= mid && j <= r){
            if(arr[l] <= arr[j]){
                temp[k++] = arr[l++];
            }
            else temp[k++] = arr[j++];
        }

        // remaining element are store as it is
        while(l <= mid){
            temp[k++] = arr[l++];
        }
        while(j <= r){
            temp[k++] = arr[j++];
        }

        // suppose left is start form right side so we have to store that element sin proper position we use left + x
        for(int x=0; x<temp.length; x++){
            arr[left + x] = temp[x];
        }
    }

    static void sort(int[] arr, int l, int r){
        if(l<r){
            int mid = (l+r)/2;

            sort(arr, l, mid);
            sort(arr, mid+1, r);            // divide till the arays are 1 element
            merge(arr, l, mid, r);
        }
    }


    public static void main(String[] args){
        int arr[] = {5,2,3,1};

        sort(arr, 0, arr.length-1);

        System.out.print(Arrays.toString(arr));
    }
}
