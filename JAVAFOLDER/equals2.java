import java.io.*;

public class equals2 {
    public static void main(String[] args) {
      Console cs=System.console();
        String s1=cs.readLine();
        String s2=cs.readLine();
        if(s1.equals(s2)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
