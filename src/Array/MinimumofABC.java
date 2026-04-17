package Array;

import java.util.Scanner;

public class MinimumofABC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a[] = { 8 , 6 , 4 , 5 , 7 , 9 , 2 };
        int b[] = {'c', 'a', 'b' , 'b', 'a' , 'c' , 'a'};

        int minA = Integer.MAX_VALUE;
        int minB = Integer.MAX_VALUE;
        int minC = Integer.MAX_VALUE;

        for(int i=0; i<a.length; i++){
            if(b[i] == 'a'){
                minA = Math.min(minA, a[i]);
            }
            else if(b[i] == 'b'){
                minB = Math.min(minB , a[i]);
            }
            else  minC = Math.min(minC, a[i]);
        }

        long sum = minA + minB;
        System.out.println(Math.min(sum, minC));

    }
}
