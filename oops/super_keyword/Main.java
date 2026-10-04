package oops.super_keyword;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("manjeeeeeet","Singh");
        Student s1 = new Student("harry", "potter", 7.5);
        Employee e1 = new Employee("Laal", "Singh", 5800);
        e1.showName();
        e1.showSalary();
    }
}
