// week7_program3.java
interface A {
    void displayA();
}
interface B {
    void displayB();
}

public class week7_program3 implements A, B {
    public void displayA() {
        System.out.println("Display from Interface A");
    }
    public void displayB() {
        System.out.println("Display from Interface B");
    }

    public static void main(String[] args) {
        week7_program3 obj = new week7_program3();
        obj.displayA();
        obj.displayB();
    }
}
