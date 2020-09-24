package issp;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Thread1 t1 = new Thread1();
        t1.start();
        t1.setPriority(10);
        t1.setName("My Thread");
        System.out.println("Main");
        Thread2 t2 = new Thread2();
        Thread t = new Thread(t2);
        t.start();
        t.setPriority(1);
    }
}
