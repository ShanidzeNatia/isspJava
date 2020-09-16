package issp;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("================");
        Test2 test2_1 = new Test2();
        System.out.println(test2_1.y+9);
        Test2 test2_2 = new Test2(45);
        Test2 test2_3 = new Test2(45.0);
        Test2 test2_4 = new Test2(45, 6.9);
        Test2 test2_5 = new Test2(6.9, 45);

        test1 test1_12 = new test1();
        test1_12.printSomething();
        System.out.println("------------------");
        test1_1 test1_121 = new test1_1();
        test1_121.printSomething();

        System.out.println("------------------");
        test1_1 test1_122 = new test1_1(43);
//        test1_121.printSomething();

        finalClass f = new finalClass();

//        abstr2 ab = new abstr2();

        abstr3 abs = new abstr3();
        abs.m1();

    }
}

final class finalClass{
   finalClass(){
       System.out.println("Final Class");
   }
}



abstract class abstr2{
    public void m1(){
        System.out.println("This is method m1");
    }
}

class abstr3 extends abstr2{

}


class test1{
    public void printSomething(){
        System.out.println("Test 1 Class");
    }

    public test1() {
        System.out.println("Constructor of test1");
    }

    public test1(int x) {
        System.out.println("Constructor x="+x);
    }
}

class test1_1  extends test1{
    public test1_1(){
        System.out.println("Constructor of test1_1");
    }

    public test1_1(int x) {
        super(x);
        System.out.println("Constructor x="+(x+8));
    }

}
