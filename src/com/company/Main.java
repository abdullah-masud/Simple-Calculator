package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");

        double n1,n2;
        n1 = scanner.nextDouble();
        n2 = scanner.nextDouble();
        System.out.printf("\n");

        Calculator calculator = new Calculator(n1,n2); // Object created

        while(true)
        {
            System.out.println("Enter an operator or 0 to exit: ");
            System.out.println("+ : Addition");
            System.out.println("- : Subtraction");
            System.out.println("* : Multiplication");
            System.out.println("/ : Division");
            System.out.println("^ : Power (x^y)");

            char choice = scanner.next().charAt(0);
            System.out.printf("\n");

            if(choice == '0')
            {
                System.out.println("Exiting...");
                break;
            }
            else if(choice == '+')
            {
                System.out.printf("Addition : %.0f\n",calculator.addition());
                System.out.printf("\n");
            }
            else if(choice == '-')
            {
                System.out.printf("Subtraction : %.0f\n",calculator.subtraction());
                System.out.printf("\n");
            }
            else if(choice == '*')
            {
                System.out.printf("Multiplication : %.0f\n",calculator.multiplication());
                System.out.printf("\n");
            }
            else if(choice == '/')
            {
                System.out.printf("Division : %.2f\n",calculator.division());
                System.out.printf("\n");
            }
            else if(choice == '^')
            {
                System.out.printf("Power: %.0f\n", calculator.power());
                System.out.printf("\n");
            }
            else
            {
                System.out.println("Error! Operator is not correct");
                System.out.printf("\n");
            }
        }
    }
}
