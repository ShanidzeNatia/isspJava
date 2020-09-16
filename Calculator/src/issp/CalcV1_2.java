package issp;

import java.util.Scanner;

public class CalcV1_2 {
    private  Scanner scanner = new Scanner(System.in);
    private String formula = "";
    CalcV1_2(){
        int position, n1, n2;
        System.out.println("Simple Calculator V1.1");
        System.out.print("Enter your math formula: ");
        formula = scanner.next();
//        System.out.println(formula);
        position = checkOperationSymbol2(formula);
//        System.out.println(formula.substring(0, position)); // [0, 2)
        n1 = Integer.parseInt(formula.substring(0, position));
        n2 = Integer.parseInt(formula.substring(position+1, formula.length()));
//        Character c = formula.charAt(position);
//        String operationSymbolS = c.toString();
        char operationSymbol = formula.charAt(position);
        switch (operationSymbol) {
            case '+':
                System.out.println(n1 + n2);
                break;
            case '-':
                System.out.println(n1 - n2);
                break;
            case '*':
                System.out.println(n1 * n2);
                break;
            case '/':
                System.out.println(n1 / n2);
                break;
            default:
                System.out.println("It is not a valid symbol!!");
        }
    }

    private boolean checkOperationSymbol(String f){
        String [] operation = {"+", "-", "*", "/"};
        for(int i=0; i<operation.length; i++){
            if(f.contains(operation[i])){
                return f.contains(operation[i]);
            }
        }
        return false;
    }

    private int checkOperationSymbol2(String f){
        String operation = "+-*/";
        for(int i=0; i<operation.length(); i++){
            if(f.indexOf(operation.charAt(i))!=-1){
                return f.indexOf(operation.charAt(i));
            }
        }
        return -1;
    }
}
