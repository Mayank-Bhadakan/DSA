package Array;

public class BubbleSort {
    public static void main(String[] args){
        // in bubble sort we have to here sort the whole array
        // we have to sort in ascending order where all the elements are in sort ascending order
        // in bubble sort suppose one element is bubble compare with next element if that element is smaller than by it self then swip otherwise pass bubble
        // ex. i > i+1   =>  swap i+1 < i
        // ex  i < i+1  =>   pass bubble only
        // loop start from 0 to n inside another loop which is start till 0 to n-i  ( here decrement i tile when the first loop finish)

        int arr[] = {6,2,3,5,7,9,0,7,6,5,2,1,323,4,56,67,78,89,90,34};

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
