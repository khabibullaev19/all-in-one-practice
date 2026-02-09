package javapractice.classandobjectspart2;

public class Student {

    public String name;
    public int age;
    public String gradeLevel;

    public String toString() {
        return "Student: \n" +
                "name: " + name +
                "\nage: " + age +
                "\ngradeLevel: " + gradeLevel;
    }

    public Student(String name, int age, String gradeLevel) {
        this.name = name;
        this.age = age;
        this.gradeLevel = gradeLevel;
    }

}
