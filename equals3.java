import java.io.*;

public class equals3 {
    public static void main(String[] args) {
      Console cs=System.console();
      PrintWriter pw=new PrintWriter(System.out);
        String s1=cs.readLine();
        String s2=cs.readLine();
        if(s1.equals(s2)){
           pw.write("yes");
           pw.flush();
        }
        else{
            pw.write("no");
            pw.flush();
        }
    }
}
