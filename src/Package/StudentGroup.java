package Package;

import java.util.Arrays;

public class StudentGroup {

    String groupSubject;
    Student[] students;
    int freePlaces;

    public StudentGroup() {
        this.students = new Student[5];
        this.freePlaces = 5;
    }

    public StudentGroup(String groupSubject) {
        this();
        this.groupSubject = groupSubject;
    }

    void addStudent(Student newStudent) {
        for(int i = 0; i < this.students.length; ++i) {
            if (this.students[i] == null && this.groupSubject.equals(newStudent.getSubject())) {
                this.students[i] = newStudent;
                --this.freePlaces;
                System.out.println("Student " + newStudent.getName() + " is added to the group. ");
                return;
            }

            if (this.students[i] == null && !this.groupSubject.equals(newStudent.getSubject())) {
                System.out.println("The classes are not equal!");
                return;
            }
        }

    }

    void emptyGroup() {
        for(int i = 0; i < this.students.length; ++i) {
            if (this.students[i] != null) {
                this.students[i] = null;
                ++this.freePlaces;
                System.out.println(this.freePlaces + "left");
            }
        }

    }

    void theBestStudent() {
        Student bestStudent = this.students[0];

        for(int i = 1; i < this.students.length; ++i) {
            if (this.students[i].getGrade() > bestStudent.getGrade()) {
                bestStudent = this.students[i];
            }
        }

        System.out.println(bestStudent);
    }

    public String toString() {
        int var10000 = this.freePlaces;
        return "StudentGroup{freePlaces=" + var10000 + ", groupSubject='" + this.groupSubject + "', students=" + Arrays.toString(this.students) + "}";
    }

    void infoGroupStudents() {
        System.out.println(this.toString());
    }
}
