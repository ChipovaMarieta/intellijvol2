package Package;

public class Person {

    private String name;
    private int age;
    private boolean isMan;

    public Person(String name, int age, boolean isMan) {
        this.name = name;
        this.age = age;
        this.isMan = isMan;
    }

    public Person() {
    }

    public String toString() {
        return "Person{age=" + this.age + ", name='" + this.name + "', isMan=" + this.isMan + "}";
    }

    void infoPersonData() {
        System.out.println(this.toString());
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMan() {
        return this.isMan;
    }

    public void setMan(boolean man) {
        this.isMan = man;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
