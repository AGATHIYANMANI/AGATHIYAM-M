
import java.io.*;

public class maxachieve2 {
    public static void main(String[] args) throws IOException{
        Console cs = System.console();

        int num = Integer.parseInt(cs.readLine());
        int t = Integer.parseInt(cs.readLine());
        int result = num + (2 * t);
        System.out.println(result);

    }

}