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

    public Student(String name){
        this.name = name;
    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

}
