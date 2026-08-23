import java.io.*;

public class nextsquare3 {
     public static void main(String [] args){
        Console cs=System.console();
        PrintWriter pw=new PrintWriter(System.out);
        int num=Integer.parseInt(cs.readLine());
        int result=num*2;
        pw.write(result); 
        pw.flush();
    }
}
