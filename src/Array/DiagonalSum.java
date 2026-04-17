package Array;

import java.util.Scanner;

public class DiagonalSum {
    // this is matrix Diagonal sum for 2 dimension array
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int leftSum = 0;
        int rightSum = 0;
        int arr[][] = new int[n][n];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();

                if(i == j) leftSum += arr[i][j];
                if(i+j == arr[i].length-1) rightSum += arr[i][j];
            }
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("leftSum = " + leftSum);
        System.out.println("rightSum = " + rightSum);
    }
}
