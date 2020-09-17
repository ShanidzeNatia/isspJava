package issp;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        int [] a = {2, 3, 4};
        int x = 0;
//
        try{
//            x = 34;

            System.out.println(23);
//            System.out.println(15/x);
            System.out.println(a[8]);
            System.out.println(34);
        }catch (Exception e){
            System.out.println("It is Array Error");
            System.out.println(e.getMessage());
        }finally {
            x = 13;
            System.out.println("finally block");
        }
        System.out.println(x+12);
        System.out.println("Programm is finished");
    }


}
