package issp;

public class Test2 {
    private  int x = 12;
    int y = 23;
    public Test2() {
        System.out.println("Start");
    }

    public Test2(int x) {
        System.out.println("x="+x);
    }

    public Test2(double x) {
        System.out.println("x="+(x+2));
    }

    public Test2(int x, double y) {
        System.out.println("x="+x+", y="+y);
    }

    public Test2(double y, int x) {
        System.out.println("x="+(x+3)+", y="+(y+3));
    }
}
