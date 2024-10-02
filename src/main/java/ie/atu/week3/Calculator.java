package ie.atu.week3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("Please enter the first number: ");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        System.out.println("Please enter the second number: ");

        int b = sc.nextInt();

        System.out.println("Please enter an operation: ");

        String op = sc.next();

        switch (op)
        {
            case "add": add(a, b); break;

            case "subtract": subtract(a, b); break;

            case "multiply": multiply(a, b); break;

            case "divide": divide(a, b); break;

            default:
                System.out.println("Invalid Operation"); break;

        }

    }

    public static void add(int a, int b) {

        int sum = a + b;
        System.out.println("The sum is: " + sum);


    }

    public static void subtract(int a, int b) {

        int sum = a - b;
        System.out.println("The sum is: " + sum);


    }


    public static void multiply(int a, int b) {

        int sum = a * b;
        System.out.println("The sum is: " + sum);

    }

    public static void divide(int a, int b) {

        Scanner sc2 = new Scanner(System.in);
        if(b == 0)
        {
            System.out.println("Enter another number except 0: ");
            int c = sc2.nextInt();

            int sum = a / c;

            System.out.println("The sum is: " + sum);
        }
        else {
            int sum = a / b;

            System.out.println("The sum is: " + sum);
        }



    }
}
