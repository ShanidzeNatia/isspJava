package issp;

import java.util.Scanner;

public class CalcV1_1 {
    CalcV1_1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple Calculator V1.1");
        scanner = new Scanner(System.in);
        while(true) {
            double n1 = 0, n2 = 0;
            System.out.print("Enter First Number: ");
            n1 = scanner.nextDouble();
            System.out.print("Enter Second Number: ");
            n2 = scanner.nextDouble();
            System.out.print("Enter operation Symbols (+, -, *, /):");
            String operation = scanner.next();
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
