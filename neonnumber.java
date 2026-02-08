import java.util.*;

public class neonnumber {

    void exp(int a) {
        int temp = a;
        int square = a * a;
        int sum = 0;

        while (square > 0) {
            int digit = square % 10;
            sum = sum + digit;
            square = square / 10;
        }

        if (temp == sum) {
            System.out.println("The number is a Neon Number");
        } else {
            System.out.println("The number is NOT a Neon Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        neonnumber ne = new neonnumber();
        ne.exp(a);
    }
}
