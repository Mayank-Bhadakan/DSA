package Array;

import java.util.Arrays;

public class EvenArray {
    // sheet no. 75
    // divide 2 part left & right => find sum => difference add that element in that array which has less sum number;

    public static void main(String[] args){
        int arr[] = {50, 50, 50, 1, 1, 1};
        int ans[] = new int[arr.length + 1];

        int i = 0;
        int j = arr.length-1;
        int sumleft = 0;
        int sumright = 0;

        while(i<j){
            sumleft += arr[i];
            sumright += arr[j];

            i++;
            j--;
        }

        int dif = Math.abs(sumleft - sumright);
        if(sumleft < sumright){
            ans[0] = dif;
            for(int k=1; k<ans.length; k++){
                ans[k] = arr[k-1];
            }
        }
        else{
            ans[ans.length-1] = dif;
            for(int k=0; k<ans.length-1; k++){
                ans[k] = arr[k];
            }
        }
        System.out.println(dif);
        System.out.print(Arrays.toString(ans));
    }
}
