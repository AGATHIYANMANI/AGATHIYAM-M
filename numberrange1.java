import java.io.*;

public class numberrange1 {
    public static void main(String[] args) throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int num3 = Integer.parseInt(br.readLine());

        if (num2 >= num3) {
            if (num1 <= num2 && num1 >= num3) {
                bw.write("Number is between " + num3 + " and " + num2);
                bw.flush();
            } else {
                bw.write("Number is not between " + num3 + " and " + num2);
                bw.flush();

            }
        } else {
            if (num1 >= num2 && num1 <= num3) {
                bw.write("Number is between " + num2 + " and " + num3);
                bw.flush();
            } else {
                bw.write("Number is not between " + num2 + " and " + num3);
                bw.flush();
            }
        }

       
    }
}
