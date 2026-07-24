import java.io.*;

public class numberrange3 {
    public static void main(String[] args) throws IOException{
        Console cs=System.console();
        PrintWriter pw=new PrintWriter(System.out);
        int num1 = Integer.parseInt(cs.readLine());
        int num2 = Integer.parseInt(cs.readLine());
        int num3 =  Integer.parseInt(cs.readLine());

        if (num2 >= num3) {
            if (num1 <= num2 && num1 >= num3) {
                pw.write("Number is between " + num3 + " and " + num2);
                pw.flush();
            } else {
                pw.write("Number is not between " + num3 + " and " + num2);
                pw.flush();
            }
        } else {
            if (num1 >= num2 && num1 <= num3) {
                pw.write("Number is between " + num2 + " and " + num3);
                pw.flush();
            } else {
                pw.write("Number is not between " + num2 + " and " + num3);
                pw.flush();
            }
        }

       
    }
}
