import java.io.*;
public class power2 {
  
    public static void main(String[] args) throws IOException{
       Console cs=System.console();
        double x=Double.parseDouble(cs.readLine());
        int n=Integer.parseInt(cs.readLine());
        double result=Math.pow(x,n);
        System.out.println("POWERED:"+result);
    }
}
