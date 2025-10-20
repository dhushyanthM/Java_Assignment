// week6_program3.java
class Employee {
    void work() {
        System.out.println("Employee is working");
    }
}

public class week6_program3 extends Employee {
    @Override
    void work() {
        System.out.println("Manager is managing the team");
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.work();                 // base behavior

        week6_program3 m = new week6_program3();
        m.work();                 // overridden behavior
    }
}
