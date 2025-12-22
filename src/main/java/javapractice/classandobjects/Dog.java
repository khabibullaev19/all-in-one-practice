package javapractice.classandobjects;

public class Dog {

    public String name;
    public String breed;
    public int age;
    public char gender;

    public void eat() {
        System.out.println(name + " is eating!");
    }

    public void sleep() {
        System.out.println(name + " is sleeping!");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
