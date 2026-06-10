import java.io.*;

public class arithemetic3 {

    int add(int a, int b) {
        return a + b;
    }

    int mul(int a, int b) {
        return a * b;
    }

    int sub(int a, int b) {
        return a - b;
    }

    int div(int a, int b) {
        return a / b;
    }

    int mod(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) throws IOException {

       Console cs=System.console();

        int a = Integer.parseInt(cs.readLine());
        int b = Integer.parseInt(cs.readLine());

        arithemetic2 obj = new arithemetic2();

       System.out.printf("ADDITION: " + obj.add(a, b));
       

        System.out.printf("MULTIPLICATION: " + obj.mul(a, b));
        

        System.out.printf("SUBTRACTION: " + obj.sub(a, b));
        

       System.out.printf("DIVISION: " + obj.div(a, b));
        

       System.out.printf("MODULAR: " + obj.mod(a, b));
        

     
        
    }
}
