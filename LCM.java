import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int x = a;
        int y = b;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int hcf = a;
        int lcm = (x * y) / hcf;

        System.out.println("LCM of " + x + " and " + y + " is: " + lcm);
    }
}
