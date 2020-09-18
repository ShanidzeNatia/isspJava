package issp;

import files.FileWorker;
import student.Student;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        StaticEx staticEx = new StaticEx();
//        staticEx.printSomething();
//        StaticEx.printSomething();
        FileWorker fileWorker = new FileWorker();
    }

    public static void packageJava(){
        Scanner  scanner = new Scanner(System.in);
        Person person1 = new Person("Ana", "Bitadze", "2324324324242", 34);
        Person person2 = new Person();
        System.out.println(person1.name);
        System.out.println(person1.getAge());
        Student student = new Student();
        System.out.println(student.lastName);
        System.out.println(person2.lastName);
    }
}
