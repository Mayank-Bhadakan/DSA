package Array;

import java.util.Scanner;

public class LinearSearchElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {10,20,30,40,50,60};
        int n = sc.nextInt();
        int index = -1;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == n) {
                index = i;
                break;
            }
        }

        if(index == -1) System.out.println("Element not found");
        else System.out.println("element found is on " + index +" index");
    }
}
