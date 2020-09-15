package Lecture1;

import java.util.Scanner;

public class Main {
    public static Scanner scanner;
    public static void main(String[] args) {
	// write your code here
        System.out.println("Simple Calculator");
        scanner = new Scanner(System.in);
        while(true) {
            double n1 = 0, n2 = 0;
//        System.out.println(n1);
            System.out.print("Enter First Number: ");
            n1 = scanner.nextDouble();
            System.out.print("Enter Second Number: ");
            n2 = scanner.nextDouble();
            System.out.print("Enter operation Symbols (+, -, *, /):");
            String operation = scanner.next();
//        System.out.println(operation.charAt(2));
            switch (operation) {
                case "+":
                    System.out.println(n1 + n2);
                    break;
                case "-":
                    System.out.println(n1 - n2);
                    break;
                case "*":
                    System.out.println(n1 * n2);
                    break;
                case "/":
                    System.out.println(n1 / n2);
                    break;
                default:
                    System.out.println("It is not a valid symbol!!");
            }
            System.out.print("If you want to continue Enter (Y/N):");
            String continueS  = scanner.next();
            if(!continueS.toUpperCase().equals("Y")){
                break;
            }
        }
        scanner.close();
        System.out.println("Calculated");
    }
}
