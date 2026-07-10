import java.io.*;

public class patt1 {
      public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int rows = 5;

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                bw.write("*");
                bw.flush();
            }
            bw.write("\n ");
            bw.flush();
        }
    }
}
