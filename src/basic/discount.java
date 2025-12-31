package basic;

import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int amount = sc.nextInt();
        int discount = 0;

        if(amount >= 0 && amount <= 2000) discount = 5;
        else if (amount > 2000 && amount <= 5000) discount = 10;
        else if (amount > 5000 && amount <= 10000) discount = 15;
        else discount = 20;

        System.out.println(amount - (discount * amount)/100);
    }
}
