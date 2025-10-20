// week6_program1.java
class Person {
    String name;
    int age;

    Person(String n, int a) { // constructor
        this.name = n;
        this.age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class week6_program1 extends Person {
    int studentId;

    week6_program1(String n, int a, int id) {
        super(n, a); // call Person constructor
        this.studentId = id;
    }

    void showDetails() {
        display();
        System.out.println("Student ID: " + studentId);
    }

    public static void main(String[] args) {
        week6_program1 s = new week6_program1("Dhushyanth", 25, 101);
        s.showDetails();
    }
}
