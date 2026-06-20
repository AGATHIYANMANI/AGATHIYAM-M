
import java.io.*;
public class findingbig3 {
    void cal(int a,int b,int c){
        if(a>=b&&a>=c){
            System.out.printf("%d is BIG",a);
        }
        else if(b>=a&&b>=c){
            System.out.printf("%d is BIG",b);
        }
        else{
            System.out.printf("%d is BIG",c);
        }
    }
    public static void main(String[] args) {
        Console cs=System.console();
        int a=Integer.parseInt(cs.readLine());
        int b=Integer.parseInt(cs.readLine());
        int c=Integer.parseInt(cs.readLine());
        findingbig3 bg=new findingbig3();
        bg.cal(a,b,c);
    }
}
