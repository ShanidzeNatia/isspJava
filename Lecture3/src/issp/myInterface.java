package issp;

public interface myInterface {
    public void print();
    public void printNubmer(int x);
    public int returnSum(int x, int y);
    default void m(){
        System.out.println("hello Interface");
    }
}
