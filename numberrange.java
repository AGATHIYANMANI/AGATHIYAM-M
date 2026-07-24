import java.util.*;

public class numberrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if (num2 >= num3) {
            if (num1 <= num2 && num1 >= num3) {
                System.out.println("Number is between " + num3 + " and " + num2);
            } else {
                System.out.println("Number is not between " + num3 + " and " + num2);
            }
        } else {
            if (num1 >= num2 && num1 <= num3) {
                System.out.println("Number is between " + num2 + " and " + num3);
            } else {
                System.out.println("Number is not between " + num2 + " and " + num3);
            }
        }

       
    }
}