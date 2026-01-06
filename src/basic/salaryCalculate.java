package basic;

import java.util.Scanner;

public class salaryCalculate {
    /*

    male >= 10 , post-graduate = 15,000
    male >= 10 , graduate = 10,000
    male < 10 , post-graduate = 10,000
    male < 10 , graduate = 7,000

    female  >= 10 graduate = 9,000
    female  < 10 post-graduate = 10,000
    female  < 10 graduate = 6,000

     */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your gender (m or f) : ");
        char gender = sc.next().charAt(0);

        System.out.println("Enter your work of experience: ");
        int year = sc.nextInt();

        sc.nextLine();
        System.out.println("Enter your qualification (graduate or post-graduate: ");
        String qualification = sc.nextLine();

        int salary = 0;

        if(gender == 'm' || gender == 'M'){
            if (year >= 10){
                if(qualification.equals("post-graduate")){
                    salary = 15000;
                }
                else if (qualification.equals("graduate")){
                    salary = 10000;
                }
                else System.out.println("invalid qualification");
            }
            else {
                if(qualification.equals("post-graduate")){
                    salary = 10000;
                }
                else if (qualification.equals("graduate")){
                    salary = 7000;
                }
                else System.out.println("invalid qualification");
            }
        } else if (gender == 'f' || gender == 'F') {
            if (year >= 10){
                if(qualification.equals("graduate")) salary = 9000;
                else if( qualification.equals("post-graduate")) salary = 11000;
                else System.out.println("Invalid qualification");
            }
            else {
                if( qualification.equals("post-graduate")) salary = 10000;
                else if (qualification.equals("graduate")) salary = 6000;
                else System.out.println("invalid qualification");
            }
        }
        else System.out.println("Invalid gender");

        System.out.println("Your salary is: " + salary);

    }

}
