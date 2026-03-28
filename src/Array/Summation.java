package Array;

// Given a sorted array of distinct elements, find the summation of absolute differences of all pairs in the given array.
// (Ex: arr[] = {1, 2, 3, 4}, Output: 10)
// distance find between two elements 1 to 2, 1 to 3, 1 to 4
// 2 to 3 , 2 to 4
/// ....

public class Summation {
    public static void main(String[] args){
        int arr[] = {1, 2, 4, 7, 11};
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++ ){
                int dif = arr[j] - arr[i];
                sum += dif;
            }
        }

        System.out.println(sum);
    }
}
