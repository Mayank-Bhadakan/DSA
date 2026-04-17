package BinarySearch;

import java.util.Scanner;

public class ElementIndexSearch {
    // if the element found then print that index otherwise print -1.   sheet no. -1;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int arr[] = {1,3,4,5,6,7,8,9,10,12};

        System.out.println("Enter a number which you want to find in array: ");
        int n = sc.nextInt();
        int index = -1;

        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == n){
                index = mid;
                break;
            }
            else if(arr[mid] < n) {
                start =  mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        System.out.println("The index number is: " + index);
    }
}
