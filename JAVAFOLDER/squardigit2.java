import java.io.*;

public class squardigit2 {
     public static void main(String[] args) throws IOException{
        Console cs=System.console();
        int num=Integer.parseInt(cs.readLine());
        int sum=0;
        while(num>0){
            int last=num%10;
            num/=10;
            int mul=last*last;
            sum+=mul;
            
        }
        System.out.println(sum);
    }
}
