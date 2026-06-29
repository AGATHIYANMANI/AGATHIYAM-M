
import java.io.*;

public class chartoint1{
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        char name=br.readLine().charAt(0);
        int convert=(int)name;
        bw.write("Integer of character "+name + " is "+ convert);
        bw.flush();


    }
}