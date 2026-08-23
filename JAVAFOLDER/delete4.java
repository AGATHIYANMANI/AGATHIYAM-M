import java.io.*;

public class delete4 {
    public static void main(String[] args){
        Console cs=System.console();
        PrintWriter pw=new PrintWriter(System.out);
        String sentence=cs.readLine();
        StringBuilder sb=new StringBuilder(sentence);
        sb.delete(2,3);
        pw.write(sb.toString());
        pw.flush();
    } 
}
