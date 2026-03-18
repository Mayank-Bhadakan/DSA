package Array;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int arr[] = {2,4,6,8,4,5,0,15};
        int target = sc.nextInt();
        int find = -1;

        // This is a linear search so here we just need to find perticular target which is exactly same linke in array then just print that index of element

        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                find = i;
                System.out.println("The element is on " + find + " index.");
                break;
            }
        }


    }
}
