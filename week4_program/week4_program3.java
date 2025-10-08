import java.util.Scanner;

public class week4_program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.println("Reversed array:");
        for (int i = n - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
        System.out.println();
        sc.close();
    }
}
