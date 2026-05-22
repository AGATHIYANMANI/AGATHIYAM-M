import java.io.*;

public class ReverseString {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("Enter a string: ");
        bw.flush();

        String str = br.readLine();
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        bw.write("Reversed string: " + rev);
        bw.flush();
    }
} 
    