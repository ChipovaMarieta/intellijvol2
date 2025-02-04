# Project 2

Some java code demonstrationg the inheritance and encapsulation principles.

Create a hierarchy of the classes Person, Student, and Employee.

The Person class represents a person and should have the following:

Fields:
name – the person's name
age – the person's age
isMan – a boolean field indicating gender

Constructor:
A single constructor that takes parameters for all class fields

Method:
showPersonInfo() – a method that displays the person's information (prints all field values to the console in an appropriate way)
The Student class, inheriting from Person, represents a student and should have:

The Student class, inheriting from Person, represents a student and should have:

Field:
score – the student's grade (a number between 2 and 6, not necessarily an integer)

Constructor:
Student(String name, int age, boolean isMan, double score) – assigns values to both inherited and new fields

Method:
showStudentInfo() – displays information about the person along with their grade (prints messages to the screen)
The Employee class, inheriting from Person, should define:

The Employee class, inheriting from Person, should define:

Field:
daySalary – the worker's daily wage

Constructor:
Initializes all fields (both inherited and new ones)

Methods:
If an employee works overtime, they are entitled to an additional amount of money for the hours worked.

The amount is calculated as follows:

If the employee is under 18 years old, the owed amount is 0.

Otherwise, for each extra hour worked, the employee is paid their hourly rate (based on their daily wage) multiplied by 1.5.

calculateOvertime(double hours) – calculates and returns the amount owed for overtime work.

showEmployeeInfo() – displays information about the person and their daily salary.

Demonstration Class with main Method:
Create an array of 10 elements of type Person.
Create two objects of each type (Person, Student, and Employee) and insert them into the array.
Iterate through the array and, depending on whether the object is a Person, Student, or Employee, call the corresponding method (showPersonInfo, showStudentInfo, or showEmployeeInfo).
Iterate through the array again and, for each Employee, print the amount they are owed for 2 hours of overtime work.
