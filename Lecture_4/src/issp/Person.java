package issp;

public class Person {
    String name = "Dato";
    public String lastName = "Abashidze";
    protected String idNumber = "123232434234";
    private int age = 20;

    public Person() {
    }

    public Person(String name, String lastName, String idNumber, int age) {
        this.name = name;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public int getAge() {
        return age;
    }
}
