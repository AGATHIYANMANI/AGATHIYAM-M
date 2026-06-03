import java.io.Console;

/**
 * LCM Calculation using Console with printf()
 * Method: System.console() + printf() for formatted output
 */
public class LCM_Console_Printf {

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

        Console console = System.console();

        if (console == null) {
            System.out.println("Console not available. Run from terminal.");
            return;
        }

        console.printf("==============================%n");
        console.printf("  LCM Calculator (printf)     %n");
        console.printf("==============================%n");

        String input1 = console.readLine("Enter first number  : ");
        String input2 = console.readLine("Enter second number : ");

        int num1 = Integer.parseInt(input1.trim());
        int num2 = Integer.parseInt(input2.trim());

        int result = lcm(num1, num2);

        console.printf("LCM of %d and %d = %d%n", num1, num2, result);
    }
}
