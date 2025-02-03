package Package;

public class College {

    public static void main(String[] args) {
        Student student1 = new Student(22, "Katq", "Math");
        student1.setYearInCollege(4);
        Student student2 = new Student(23, "petq", "Math");
        Student student3 = new Student(19, "Ivan", "Math");
        Student student4 = new Student(20, "igor", "Math");
        Student student5 = new Student(25, "toni", "English");
        Student student6 = new Student(26, "Nasq", "Math");
        System.out.println("Student 2:" + student2.getName());
        student2.setGrade(5.0);
        student3.setGrade(3.0);
        student4.setGrade(4.8);
        student5.setGrade(3.6);
        student6.setGrade(5.5);
        student1.upYear();
        double scolarship = student1.receiveScoraship(3.5, 32.0);
        System.out.println(scolarship);
        StudentGroup mathClass = new StudentGroup("Math");
        mathClass.addStudent(student1);
        mathClass.addStudent(student2);
        mathClass.addStudent(student3);
        mathClass.addStudent(student5);
        mathClass.addStudent(student6);
        mathClass.addStudent(student4);
        System.out.println(mathClass.toString());
        mathClass.emptyGroup();
        System.out.println(mathClass.toString());
        mathClass.theBestStudent();
        mathClass.infoGroupStudents();
    }
}
