import java.io.*;
public class power3 {
  
    public static void main(String[] args) throws IOException{
       Console cs=System.console();
       PrintWriter pw=new PrintWriter(System.out);
        double x=Double.parseDouble(cs.readLine());
        int n=Integer.parseInt(cs.readLine());
        double result=Math.pow(x,n);
        pw.write("POWERED:"+result);
        pw.flush();
    }
}
