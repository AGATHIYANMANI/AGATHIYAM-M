import java.io.*;

public class arithemetic2 {

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

       System.out.println("ADDITION: " + obj.add(a, b));
       

        System.out.println("MULTIPLICATION: " + obj.mul(a, b));
        

        System.out.println("SUBTRACTION: " + obj.sub(a, b));
        

       System.out.println("DIVISION: " + obj.div(a, b));
        

       System.out.println("MODULAR: " + obj.mod(a, b));
        

     
        
    }
}
