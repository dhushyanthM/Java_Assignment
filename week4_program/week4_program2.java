import java.util.Scanner;

public class week4_program2 {
    static int maxOfThree(int a, int b, int c) {
        if (a >= b && a >= c)
            return a;
        else if (b >= a && b >= c)
            return b;
        else
            return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println("Maximum = " + maxOfThree(x, y, z));
        sc.close();
    }
}
