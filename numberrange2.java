import java.io.*;
public class numberrange2{

 public static void main(String[] args) {
        Console cs=System.console();
        int num1 = Integer.parseInt(cs.readLine());
        int num2 = Integer.parseInt(cs.readLine());
        int num3 =  Integer.parseInt(cs.readLine());

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
