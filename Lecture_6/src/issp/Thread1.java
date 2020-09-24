package issp;

public class Thread1 extends Thread {
    void printThreadName(){
        System.out.println("Class Thread1");
    }

    public void run(){
        for(int i=0; i<100; i++){
            System.out.println("Class Thread1");
        }
    }
}

class Thread2 implements Runnable{

    @Override
    public void run() {
        for(int i=0; i<100; i++){
            System.out.println("Class Thread2");
        }
    }
}
