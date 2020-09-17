package issp;

import java.util.Scanner;

public class CalcV1_3 implements  CalcMethods{
    private Scanner scanner = new Scanner(System.in);
    private String formula = "";

    public CalcV1_3() {
        System.out.println("Simple Calculator V1.3");
        System.out.print("Enter your math formula: ");
        formula = scanner.next();
        System.out.println("formula="+formula);
        formula = executeOperation(formula, "*");
        System.out.println("formula="+formula);
    }

    @Override
    public String executeOperation(String opImage, String opSymbol) {
//        System.out.println("======================");
        int indexes [] = new int[2];
        int numbers [] = new int[2];
        String exFormula = opImage;
        String subString="";
        String regEx = "\\d+";
        int position = exFormula.indexOf(opSymbol);
//        System.out.println(position);
        for(int i=1; i<=position; i++){
            subString = exFormula.substring(position-i, position);
            boolean isNumber = subString.matches(regEx);
//            System.out.println(isNumber);
//            System.out.println(subString);
            if(!isNumber){
               System.out.println(i);
               indexes[0] = position-i+1;
               break;
            }
        }
//        System.out.println(Arrays.toString(indexes));
        numbers[0] = Integer.parseInt(exFormula.substring(indexes[0], position));
//        System.out.println(Arrays.toString(numbers));
//        System.out.println("======================");
        return exFormula;
    }
}
