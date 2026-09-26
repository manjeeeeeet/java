package oops.basic_of_oops;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("spongebob",30 , 5.5);
        Student student2 = new Student("manuu",23 , 7.5);
        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.cgpa);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.cgpa);
    }
}
