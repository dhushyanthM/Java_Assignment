public class week2_program2 {
    public static void main(String[] args) {
        int num = 10;
        double implicit = num;   // implicit (widening)
        System.out.println("Implicit int to double: " + implicit);

        double val = 9.78;
        int explicit = (int) val; // explicit (narrowing)
        System.out.println("Explicit double to int: " + explicit);
    }
}