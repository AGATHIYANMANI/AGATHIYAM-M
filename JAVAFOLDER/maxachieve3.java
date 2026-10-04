import java.io.*;

public class maxachieve3 {
    public static void main(String[] args) throws IOException{
        Console cs = System.console();
        PrintWriter pw=new PrintWriter(System.out);

        int num = Integer.parseInt(cs.readLine());
        int t = Integer.parseInt(cs.readLine());
        int result = num + (2 * t);
       pw.write(result);
       pw.flush();

    }

}