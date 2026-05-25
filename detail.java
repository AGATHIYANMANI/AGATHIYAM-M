import java.io.*;

public class detail {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("Enter your name: ");
        bw.flush();
        String n = br.readLine();

        bw.write("Enter age: ");
        bw.flush();
        int a = Integer.parseInt(br.readLine());

        bw.write("Name: " + n + "\n");
        bw.write("Age: " + a + "\n");
        bw.flush();
    }
}