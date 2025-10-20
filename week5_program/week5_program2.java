public class week5_program2 {
    String name;
    int marks1, marks2, marks3;

    double calculatePercentage() {
        return (marks1 + marks2 + marks3) / 3.0;
    }

    public static void main(String[] args) {
        week5_program2 student = new week5_program2();
        student.name = "Dhushyanth";
        student.marks1 = 85;
        student.marks2 = 90;
        student.marks3 = 88;

        System.out.println("Student Name: " + student.name);
        System.out.println("Percentage: " + student.calculatePercentage() + "%");
    }
}
