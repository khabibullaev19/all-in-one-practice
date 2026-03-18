package javapractice.classandobjectspart2;

public class StudentObjects {

    public static void main(String[] args) {

//        student1.name = "John";
//        student1.age = 25;
//        student1.gradeLevel = "A";

        Student student1 = new Student("Max");
        Student student2 = new Student("Max",24);
        Student student3 = new Student("Max",25, "College");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

//        System.out.println(student1.getName());
//        System.out.println(Student.collegeName);
//        System.out.println(Student.getName());
//        System.out.println(student1.collegeName);

    }

}
