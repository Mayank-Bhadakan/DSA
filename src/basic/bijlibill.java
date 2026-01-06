package basic;

import java.util.Scanner;

// 0 - 100 unit = $4.2
// 101 - 200 unit = $6
// 201 - 400 unit = $8
// more than 400 = $10

// in this trick we are going to up to bottom

//public class bijlibill {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        int unit = sc.nextInt();
//
//        if(unit >= 0 && unit <= 100)  System.out.println( unit * 4.2 );
//        else if (unit > 100 && unit <= 200) {
//            System.out.println( (100 * 4.2) + (unit - 100) * 6);
//        }
//        else if (unit > 200 && unit <= 400) {
//            System.out.println( (100 * 4.2) + (100 * 6) + (unit - 200) * 8);
//        }
//        else {
//            System.out.println( (100 * 4.2) + (100 * 6) + (200 * 8) + (unit - 400) * 10);
//        }
//    }
//}

// OR in here we are going to bottom to up

public class bijlibill {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double unit = sc.nextInt();
        double amount = 0;

        if(unit > 400) {
            amount = (unit - 400) * 10;
            unit = 400;
        }
        if(unit <= 400 && unit >= 201){
            amount = amount + (unit - 200) * 8;
            unit = 200;
        }
        if(unit <= 200 && unit >= 101){
            amount = amount + (unit - 100) * 6;
            unit = 100;
        }
        amount = amount + (unit * 4.2);
        System.out.println(amount);
    }
}
