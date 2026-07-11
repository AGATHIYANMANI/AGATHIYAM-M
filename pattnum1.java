 import java.io.*;
 public class pattnum1{
    public static void main(String[] args) throws IOException{
        int rows = 5;
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                bw.write(String.valueOf(j));
                bw.flush();
            }
           bw.write(" \n");
           bw.flush();
        }
    }
}