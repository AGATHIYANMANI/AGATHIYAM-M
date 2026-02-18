import java.util.*;

public class spy {
    void find(int num) {
        int sum = 0;
        int product = 1;
        int temp = num;

        while (temp > 0) {
            int a = temp % 10;
            sum += a;
            product *= a;
            temp /= 10;
        }

        if (sum == product) {
            System.out.println("It is a Spy number");
        } else {
            System.out.println("It is NOT a Spy number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        spy pr = new spy();
        pr.find(num);
    }
}
