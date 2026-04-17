package Array;

import java.util.Arrays;
import java.util.HashMap;

public class MaxNoPairs {
    // sheet no 79 maximum number of pairs find
    // here we have to find number of pairs in array and also find remaining elements return in new array

    public static void main(String[] args){
        int arr[] = {1,3,2,1,3,2,2};

        // we use HashMap where first store all the values in key, when values is present in the particular key then also store new value also + 1
        // otherwise store at 0th key
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: arr){
            map.put(num, map.getOrDefault(num,0) + 1);
        }

        // here all the values are store in key like { 1 = 2; 3 = 2; 2 = 2) values
        // now calculate how many pairs are there so basically divide with 2

        int pairs = 0;
        for(int count : map.values()){
            pairs += count/2;
        }

        int leftOver = arr.length - (2 * pairs);

        int answer[] = new int[2];
        answer[0] = pairs;
        answer[1] = arr.length - ( 2 * pairs);

        System.out.print(Arrays.toString(answer));
    }
}
