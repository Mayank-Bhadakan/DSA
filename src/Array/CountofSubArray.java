package Array;

public class CountofSubArray {
    // tracking sheet no. 66
    public static void main(String[] args){
        int arr[]  = {1,2,3,7,5};
        int target = 12;
        int subArray = 0;

        for(int i=0; i<arr.length; i++){
            int sum = arr[i];
            if(sum == target) subArray++;

            for(int j=i+1; j<arr.length; j++){
                sum += arr[j];

                if(sum == target) {
                    subArray++;
                    break;
                }
            }
        }

        System.out.println(subArray);
    }
}
