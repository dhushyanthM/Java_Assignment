// week6_program2.java
public class week6_program2 {
    int add(int a, int b) {                 // add ints
        return a + b;
    }

    double add(double a, double b) {        // add doubles
        return a + b;
    }

    int add(int a, int b, int c) {          // 3-arg version
        return a + b + c;
    }

    public static void main(String[] args) {
        week6_program2 obj = new week6_program2();
        System.out.println("Sum (int, int): " + obj.add(5, 10));
        System.out.println("Sum (double, double): " + obj.add(5.5, 3.2));
        System.out.println("Sum (int, int, int): " + obj.add(1, 2, 3));
    }
}
