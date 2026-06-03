import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * LCM Calculation using BufferedReader (Buffered Method)
 * Method: BufferedReader with InputStreamReader
 */
public class LCM_BufferedReader {

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

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter first number  : ");
        int num1 = Integer.parseInt(br.readLine().trim());

        System.out.print("Enter second number : ");
        int num2 = Integer.parseInt(br.readLine().trim());

        int result = lcm(num1, num2);

        System.out.println("LCM of " + num1 + " and " + num2 + " = " + result);

        br.close();
    }
}
