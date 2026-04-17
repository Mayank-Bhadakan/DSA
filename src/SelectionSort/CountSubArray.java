package SelectionSort;

import java.util.Scanner;

public class CountSubArray {
    // Sheet no 66 Print the count of subarrays whose sum is equal to the target. (Ex - {1,2,3,7,5}, T = 12 O/P - 2 - [ {2,3,7}, {7,5} ] - Both subarrays have sum 12)

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target number: ");

        int n = sc.nextInt();

        int arr[] = {1,2,3,7,5};
        int count = 0;

        for(int i=0; i<arr.length; i++){
            int sum = arr[i];

            for(int j=i+1; j<arr.length; j++){
                sum += arr[j];
                if(sum == n) {
                    count++;
                }
                if(sum > n) {
                    break;
                }
            }
        }

        System.out.println(count);
    }

}
