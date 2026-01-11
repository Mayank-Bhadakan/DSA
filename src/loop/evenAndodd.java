package loop;

import java.util.Scanner;

public class evenAndodd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        double even = 0;
        double odd = 0;

        for(int i=0; i<=n; i++){
            if(i % 2 == 0) {
                System.out.print(i + " ");
                even += i;
            }
            else {
//                System.out.print(i + " ");
                odd += i;
            }
        }
        System.out.println();
        System.out.println("Number of even is: " + even);
        System.out.println("Number of odd is: " + odd);
    }
}
