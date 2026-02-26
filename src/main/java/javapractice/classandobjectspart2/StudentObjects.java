package javapractice.classandobjectspart2;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Max");
//        student1.name = "John";
//        student1.age = 25;
//        student1.gradeLevel = "A";

        Student student2 = new Student("Max",24);

        System.out.println(student1);
        System.out.println(student2);

    }

}
