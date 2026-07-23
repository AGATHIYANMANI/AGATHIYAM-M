import java.io.*;

public class sumeven3 {
     public static void main(String [] args){
       Console cs=System.console();
       PrintWriter pw=new PrintWriter(System.out);
        int num1=Integer.parseInt(cs.readLine());
        int num2=Integer.parseInt(cs.readLine());
        int total=num1+num2;
        String result=(total%2==0)?"even":"odd";
       pw.write(result);
       pw.flush();
    }
}
