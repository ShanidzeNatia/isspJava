package issp;

public class GenericExample <G> {
    G s;

    public GenericExample(G s) {
        this.s = s;
        System.out.println(s.getClass().getTypeName());
    }
}
