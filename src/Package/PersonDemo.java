package Package;

import java.io.PrintStream;
import java.util.Arrays;

public class PersonDemo {

    public static void main(String[] args) {
        Person person1 = new Person("Vanq", 25, false);
        Person person2 = new Person("Tedi", 38, true);
        Student student1 = new Student("Katq", 18, false, 5.0);
        Student student2 = new Student("Petq", 16, false, 4.5);
        Employee employee1 = new Employee("Ivan", 25, true, 30.0);
        Employee employee2 = new Employee("Gosho", 36, true, 45.0);
        Person[] people = new Person[]{person1, person2, student1, student2, employee1, employee2, null, null, null, null};
        System.out.println(Arrays.toString(people));

        int i;
        for(i = 0; i < people.length; ++i) {
            if (people[i] == null) {
                System.out.println("There is no information in index " + i);
            } else if (people[i] instanceof Student) {
                System.out.println("its a student");
                ((Student)people[i]).infoStudent();
            } else if (people[i] instanceof Employee) {
                System.out.println("It's a STUDENT.");
                ((Employee)people[i]).infoEmployee();
            } else {
                System.out.println("It's a person.");
                people[i].infoPersonData();
            }
        }

        for(i = 0; i < people.length; ++i) {
            if (people[i] != null && people[i] instanceof Employee) {
                double overtimePayment = ((Employee)people[i]).overtimeWork(6.0);
                PrintStream var10000 = System.out;
                String var10001 = people[i].getName();
                var10000.println("Employee " + var10001 + "- " + overtimePayment);
            }
        }

    }
}
