package Array;

public class RemoveMax {
    // Sheet no 74 fid max delete that element and right side elements also then consider only left side array and process again

    public static void main(String[] args){
        int arr[] = {3, 1, 2, 4};

        // find max
        // remove that element and right elements also
        // in left side part repeat process again

        int n = arr.length-1;
        int count = 0;

        while(n >= 0){
            int max = 0;
            for(int i=0; i<=n; i++){
                if(arr[max] < arr[i]){
                    max = i;
                }
            }
            n = max - 1;
            count++;
        }

        System.out.print(count);
    }
}
