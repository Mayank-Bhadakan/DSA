package Array;

public class AbsoluteDifference {
    // sheet no 77 Find sum of minimum absolute difference of the given array

    public static void main(String[] args){
        int arr[] = {1, 100, 200, 300};

        long total = 0;
        for(int i=0; i<arr.length; i++){
            int sum = Integer.MAX_VALUE;
            for(int j=0; j<arr.length; j++){
                if(arr[i] == arr[j]) continue;

                int dif = Math.abs(arr[i] - arr[j]);
                if(dif < sum) sum = dif;
            }

            total += sum;
        }

        System.out.print(total);
    }
}
