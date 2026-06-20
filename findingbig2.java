
import java.io.*;
public class findingbig2 {
    void cal(int a,int b,int c){
        if(a>=b&&a>=c){
            System.out.println("A is BIG");
        }
        else if(b>=a&&b>=c){
            System.out.println("B is BIG");
        }
        else{
            System.out.println("C is BIG");
        }
    }
    public static void main(String[] args) {
        Console cs=System.console();
        int a=Integer.parseInt(cs.readLine());
        int b=Integer.parseInt(cs.readLine());
        int c=Integer.parseInt(cs.readLine());
        findingbig2 bg=new findingbig2();
        bg.cal(a,b,c);
    }
}
