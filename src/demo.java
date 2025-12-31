import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
//        // sum fo two integers
//
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        System.out.println("The Sum of " + a + " & " + b + " = " + (a+b));

//        // accept name and age from user ans print in the form of hey shery, you are 21 years old.
//        String name = sc.nextLine();
//        int age = sc.nextInt();
//
//        System.out.println("Hey " + name + ", you are " + age + " years old.");

//        // swap values without using third variable
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        a = a + b;
//        b = a - b;
//        a = a - b;
//
//        System.out.println(a);
//        System.out.println(b);

//        // 7. calculate the area of rectangle and parameters
//        System.out.print("Enter length of a rectangle: ");
//        int length = sc.nextInt();
//
//        System.out.print("Enter width of a rectangle: ");
//        int width = sc.nextInt();
//
//        System.out.println("The area of a rectangle is : " + (length * width));
//        System.out.println("The parameter of a rectangle is: " + (2 * (length + width)) );

//        //8 compound interest
//        // a = p(1 + (r/n)) ^ (n*t);
//        System.out.print("Enter principle amount : ");
//        double p = sc.nextDouble();
//
//        System.out.print("Enter annual interest rate: ");
//        double r = sc.nextDouble();
//
//        System.out.print("Enter number of years: ");
//        double n = sc.nextDouble();
//
//        System.out.print("Enter number of time: ");
//        double t = sc.nextDouble();
//
//        double a = p * Math.pow( 1 + ( (r / 100) / n) , (n * t));
//
//        System.out.println( a);

//        // 9 heron's formula
//        System.out.print("Enter first side of a triangle: ");
//        int a = sc.nextInt();
//
//        System.out.print("Enter second side of a triangle: ");
//        int b = sc.nextInt();
//
//        System.out.print("Enter third side of a triangle: ");
//        int c = sc.nextInt();
//
//        double s = (a+b+c)/2;
//        double herons = Math.sqrt(s * (s - a) * (s - b) * (s - c));
//
//        System.out.println("Are of triangle is : " + herons);

//        // 10 find surface are of sphere a = 4 * 3.14 * r*r
//        System.out.print("Enter Radius: ");
//        int radius = sc.nextInt();
//        double area = 4 * 3.14 * radius * radius;
//        System.out.println("The surface are of a sphere is: " + area);

        // 11. circumference 2 * 3.14 * r  , area = 3.14 * r * r ;
//        System.out.print("Enter Radius of a circle: ");
//        int radius = sc.nextInt();
//
//        double circumference = 2 * 3.14 * radius;
//        double area = Math.PI * radius * radius;
//
//        System.out.println("The area of circumference of a rectangle is: " + circumference + " and the are is: " + area);

        // 12. greatest number
//        System.out.print("Enter First number: ");
//        int a = sc.nextInt();
//        System.out.print("Enter Second number: ");
//        int b = sc.nextInt();
//
//        if(a>b) System.out.println("a is grater then b");
//        else System.out.println("b is grater then a");

        // 13. give greeting basis of gender
//        System.out.println("Enter Gender M or F: ");
//        char gender = sc.nextLine().charAt(0);
//
//        if( gender == 'M' || gender == 'm'){
//            System.out.println("Good morning sir!");
//        }
//        else if( gender == 'F' || gender == 'f'){
//            System.out.println("Good morning ma'am!");
//        }
//        else {
//            System.out.println("Invalid input");
//        }

        // 15. even or odd number
//        System.out.println("Enter number: ");
//        int a = sc.nextInt();
//
//        if( a % 2 == 0) System.out.println( a + " is even number");
//        else System.out.println(a + " is odd number");

        // 16. valid voter or not
//        System.out.println("Enter your name: ");
//        String name = sc.nextLine();
//        System.out.println("Enter your age: ");
//        int age = sc.nextInt();
//
//        if(age >= 18) System.out.println("Hey " + name + ", You are allegeable for vote");
//        else System.out.println("Sorry " + name + ", You can't cast the vote");

//        // 17. day name
//        System.out.println("Enter Day Number 1 to 7: ");
//        int day = sc.nextInt();
//
//        switch(day) {
//            case 1: {
//                System.out.println("Monday");
//                break;
//            }
//            case 2: {
//                System.out.println("Tuesday");
//                break;
//            }
//            case 3: {
//                System.out.println("Wednesday");
//                break;
//            }
//            case 4: {
//                System.out.println("Thrusday");
//                break;
//            }
//            case 5: {
//                System.out.println("Friday");
//                break;
//            }
//            case 6: {
//                System.out.println("saturday");
//                break;
//            }
//            case 7: {
//                System.out.println("Sunday");
//                break;
//            }
//            default : {
//                System.out.println("Invalid day number entered");
//            }
//
//        }

        // 18 greatest number in 3 data
//        System.out.print("Enter first number ");
//        int a = sc.nextInt();
//        System.out.print("Enter second number ");
//        int b = sc.nextInt();
//        System.out.print("Enter third number ");
//        int c = sc.nextInt();
//
//        if(a > b){
//            if (a > c){
//                System.out.println(a + " is grater than " + b);
//            }
//            else {
//                System.out.print(c + " is grater than " + a);
//            }
//        }
//        else {
//            if(b > c){
//                System.out.println(b + " is grater than " + c );
//            }
//            else{
//                System.out.println(c + " is grater than " + b);
//            }
//        }

        // 19. leep year
        System.out.println("Enter year: ");
        int year = sc.nextInt();

        if(year % 4 == 0 && year % 100 != 0){
            System.out.println(year + " is a leap year");
        }
        else if( year % 400 == 0 ){
            System.out.println(year + " is a leap year");
        }
        else {
            System.out.println(year + " is not leap year");
        }
    }
}