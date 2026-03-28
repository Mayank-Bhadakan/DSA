package Array;

// leetcode no. 1929
// Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i]
// for 0 <= i < n (0-indexed).
//Specifically, ans is the concatenation of two nums arrays.

import java.util.Arrays;
import java.util.Scanner;

public class ConcatenatioofArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num[] = {1,3,2,1};
        int n = num.length;

        int ans[] = new int[2*n];

        for(int i=0; i<n; i++){
            ans[i] = num[i];
            ans[i + n] = num[i];
        }

        System.out.println(Arrays.toString(ans));
    }
}
