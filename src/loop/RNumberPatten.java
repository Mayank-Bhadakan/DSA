package loop;

import java.util.Scanner;

public class RNumberPatten {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("how many pattern line you want; ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
