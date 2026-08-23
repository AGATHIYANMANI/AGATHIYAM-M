
import java.io.*;

public class stringreverse2 {
    public static void main(String [] args) throws IOException{
        Console cs=System.console();
        String sentence=cs.readLine();
        StringBuilder sb = new StringBuilder(sentence);
      System.out.println(sb.reverse());
       
        
    }
}
