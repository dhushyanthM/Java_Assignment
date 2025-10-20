public class week5_program1 {
    String brand;
    String model;
    int year;

    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        week5_program1 car1 = new week5_program1();
        car1.brand = "Toyota";
        car1.model = "Camry";
        car1.year = 2020;

        car1.displayInfo();
    }
}
