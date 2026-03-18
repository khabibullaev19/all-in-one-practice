package javapractice.classandobjectspart2;

public class Student {

    public String name;
    public int age;
    public String gradeLevel;
    public static String collegeName = "Oxford University";

    public static String getName(){
        return collegeName;
    }

    public String getGradeLevel(){
        return "gradeLevel";
    }

    public String toString() {
        String age = this.age > 0 ? Integer.toString(this.age) : "unkonwn";
        return "Student: \n" +
                "name-> " + name +
                "\nage-> " + age +
                "\ngradeLevel-> " + gradeLevel;
    }

    public Student(String name){
        this(name,-1,"unknown");
//        this.name = name;
    }

    public Student(String name, int age){
        this(name,age,"unknown");
//        this.age = age;
    }

    public Student(String name, int age, String gradeLevel){
        this.name = name;
        this.age = age;
        this.gradeLevel = gradeLevel;
    }

}
