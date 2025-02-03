package Package;

public class Student extends Person {

    private String subject;
    private double grade;
    private int yearInCollege;
    private boolean isDegree;
    private double money;

    public Student(String name, int age, boolean isMan) {
        this.grade = 4.0;
        this.yearInCollege = 1;
        this.isDegree = false;
        this.money = 0.0;
    }

    public Student(int age, String name, String subject, boolean isMan) {
        super(name, age, isMan);
        this.setName(name);
        this.subject = subject;
        this.setAge(age);
    }

    public Student(String name, int age, boolean isMan, double grade) {
        super(name, age, isMan);
        this.grade = grade;
    }

    public Student(int i, String katq, String math) {
    }

    void upYear() {
        if (!this.isDegree && this.yearInCollege < 4) {
            ++this.yearInCollege;
            System.out.println("Student goes ahead!");
        } else if (!this.isDegree && this.getAge() > 4) {
            this.isDegree = true;
            System.out.println("Student has already graduated!");
        } else {
            System.out.println("Student graduated!");
        }

    }

    double receiveScoraship(double min, double amount) {
        if (this.grade > min && this.getAge() < 30) {
            amount += this.money;
        }

        return amount + this.money;
    }

    public String toString() {
        int var10000 = this.getAge();
        return "Student{age=" + var10000 + ", name='" + this.getName() + "', subject='" + this.subject + "', grade=" + this.grade + ", yearInCollege=" + this.yearInCollege + ", isDegree=" + this.isDegree + ", money=" + this.money + "}";
    }

    public String toString1() {
        double var10000 = this.grade;
        return "Student{grade=" + var10000 + ", age=" + this.getAge() + ", isMan=" + this.isMan() + ", name='" + this.getName() + "'}";
    }

    void infoStudent() {
        System.out.println(this.toString1());
    }

    public double getGrade() {
        return this.grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public boolean isDegree() {
        return this.isDegree;
    }

    public void setDegree(boolean degree) {
        this.isDegree = degree;
    }

    public double getMoney() {
        return this.money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getYearInCollege() {
        return this.yearInCollege;
    }

    public void setYearInCollege(int yearInCollege) {
        this.yearInCollege = yearInCollege;
    }
}
