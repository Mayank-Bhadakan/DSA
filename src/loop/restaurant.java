package loop;

import java.util.Scanner;

public class restaurant {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Mine's Restaurant");
        System.out.println("Enter a number which food you want to eat: 1.Panjabi 2.Gujarati 3.Italian 4.Mexican");
        int dish = sc.nextInt();

        if(dish == 1){
            System.out.println("Welcome to the Panjabi menu");
            System.out.println("Enter a number which dishes you want to eat: 1.Paratha 2.aloo-gobi 3.dal-makhani");
            int menu = sc.nextInt();
            String order = "Thank you for choosing this menu, your order will arrive soon! \n your Total payment is : ";
            if(menu == 1) System.out.println(order + "$10");
            else if(menu == 2) System.out.println(order + "$12");
            else if(menu == 3) System.out.println(order + "$15");
            else System.out.println("Invalid Input!");
        }
        else if(dish == 2){
            System.out.println("Welcome to the Gujarati menu");
            System.out.println("Enter a number which dishes you want to eat: 1.Sev-tameta 2.dahi-tikhari 3.cha-bhakhri");
            int menu = sc.nextInt();
            String order = "Thank you for choosing this menu, your order will arrive soon! \n your Total payment is : ";
            if(menu == 1) System.out.println(order + "$10");
            else if(menu == 2) System.out.println(order + "$10");
            else if(menu == 3) System.out.println(order + "$8");
            else System.out.println("Invalid Input!");
        }
        else if(dish == 3){
            System.out.println("Welcome to the Italian menu");
            System.out.println("Enter a number which dishes you want to eat: 1.Carbonara 2.Lasagna 3.Bolognese");
            int menu = sc.nextInt();
            String order = "Thank you for choosing this menu, your order will arrive soon! \n your Total payment is : ";
            if(menu == 1) System.out.println(order + "$12");
            else if(menu == 2) System.out.println(order + "$15");
            else if(menu == 3) System.out.println(order + "$20");
            else System.out.println("Invalid Input!");
        }
        else if(dish == 4){
            System.out.println("Welcome to the Mexican menu");
            System.out.println("Enter a number which dishes you want to eat: 1.Tacos 2.Enchiladas 3. Quesadillas");
            int menu = sc.nextInt();
            String order = "Thank you for choosing this menu, your order will arrive soon! \n your Total payment is : ";
            if(menu == 1) System.out.println(order + "$12");
            else if(menu == 2) System.out.println(order + "$15");
            else if(menu == 3) System.out.println(order + "$17");
            else System.out.println("Invalid Input!");
        }
        else System.out.println("Invalid Input !");
    }
}
