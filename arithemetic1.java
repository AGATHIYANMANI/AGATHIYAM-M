import java.io.*;

public class arithemetic1 {

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

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        arithemetic1 obj = new arithemetic1();

        bw.write("ADDITION: " + obj.add(a, b));
        bw.newLine();

        bw.write("MULTIPLICATION: " + obj.mul(a, b));
        bw.newLine();

        bw.write("SUBTRACTION: " + obj.sub(a, b));
        bw.newLine();

        bw.write("DIVISION: " + obj.div(a, b));
        bw.newLine();

        bw.write("MODULAR: " + obj.mod(a, b));
        bw.newLine();

        bw.flush();
        
    }
}