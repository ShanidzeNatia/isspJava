package issp;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        GenericExample gen = new GenericExample("Java");
//        System.out.println(gen.s);
//
//        GenericExample gen1 = new GenericExample(15);
//        System.out.println(gen1.s);
//
//        GenericMethod(23.9);
        List a = new LinkedList();
        a.add(12);
        a.add(13.8);
        a.add("String");
        a.add(0, 34);
        System.out.println(a);
        List a1 = new ArrayList();
        a1.add(1);
        a1.add(2);
        a1.add(87);
        a1.add(4);
        System.out.println(a1);
        System.out.println(a1.remove(2));
        System.out.println(a1);
//        a1.remove((Integer)(2));
        System.out.println(a1.remove((Integer)(2)));
        System.out.println(a1);
        a1.set(0, 89);
        System.out.println(a1);
        System.out.println(a1.get(1));
        System.out.println("====================");
        for(Object el:a1){
            System.out.println(el);
        }
        System.out.println("====================");
        ListIterator it = a1.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
//        System.out.println(it.next());
//        System.out.println(it.next());
        ArrayList <String> a3 = new ArrayList<>();
        a3.add("deee");
        System.out.println(a3);

        Queue q1 = new PriorityQueue();
        q1.add("dada");
        q1.add("add");
        q1.add("zdsfs");
        q1.add("vvv");

        System.out.println(q1);
        Iterator it2 = q1.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }

        q1.poll();
        System.out.println(q1);
//        System.out.println(q1.get(2));
        Queue q2 = new ArrayDeque();
        q2.add(12);
        q2.add(35);
        q2.add(5);
        q2.add(15);
        System.out.println(q2);
        q2.poll();
        System.out.println(q2);

        Set  s1 = new HashSet();
        s1.add(23);
        s1.add(23);
        s1.add(9);
        s1.add(11);
        s1.add(23);
        System.out.println(s1);

        for(Object el: s1){
            System.out.println(el);
        }

        HashMap m = new HashMap();


    }

    static <B> void GenericMethod(B p){
        System.out.println(p.getClass().getTypeName());
    }

    static ArrayList replaceArralist(ArrayList g, Object v1, Object v2){
        ArrayList arrayList = new ArrayList();
        return  arrayList;
    }
}
