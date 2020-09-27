package tictactoe;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    String[][] display = {  {"1", "2", "3"},
                            {"4", "5", "6"},
                            {"7", "8", "9"}};
    public TicTacToe() {
        System.out.println(Arrays.deepToString(display));
        printDisplay();
        while (true) {
            enterX();
            printDisplay();
        }
    }

    void printDisplay(){
        for(int i=0; i<3; i++){
            System.out.println(Arrays.toString(display[i]));
//            System.out.println();
        }
    }

    void enterX(){
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Gamer: ");
        number = scanner.nextInt();
        if(number>=1 && number<=9){
            replaceX(number);
        }else{
            System.out.println("It is wrang number!!!");
        }
    }

    void replaceX(int number){
        /*if(number/3 == 0 ) {
            display[number/3-1][2] = "x";
        }else {
            display[number/3][(number%3)-1] = "x";
            System.out.println(number%3);
//            display[2][1]
        }*/
        
        // uprimitiulesi solution
        for (int i=0; i<display.length; i++){
            for (int j=0; j< display.length; j++){
                if(display[i][j].equals(Integer.toString(number))){
                    display[i][j] = "x";
                    break;
                }
            }
        }
    }
}
