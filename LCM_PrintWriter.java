import java.io.PrintWriter;
import java.util.Scanner;

/**
 * LCM Calculation using PrintWriter
 * Method: PrintWriter wrapping System.out for output
 */
public class LCM_PrintWriter {

    // Method to calculate GCD (used to find LCM)
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to calculate LCM
    static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    public static void main(String[] args) {

        // PrintWriter wraps System.out; autoFlush = true ensures output is displayed immediately
        PrintWriter pw = new PrintWriter(System.out, true);
        Scanner sc = new Scanner(System.in);

        pw.println("=== LCM Calculator (PrintWriter) ===");

        pw.print("Enter first number  : ");
        int num1 = sc.nextInt();

        pw.print("Enter second number : ");
        int num2 = sc.nextInt();

        int result = lcm(num1, num2);

        pw.printf("LCM of %d and %d = %d%n", num1, num2, result);

        pw.close();
        sc.close();
    }
}
