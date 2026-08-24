import java.io.*;

public class squardigit3 {
      public static void main(String[] args) throws IOException{
        Console cs=System.console();
        PrintWriter pw=new PrintWriter(System.out);
        int num=Integer.parseInt(cs.readLine());
        int sum=0;
        while(num>0){
            int last=num%10;
            num/=10;
            int mul=last*last;
            sum+=mul;
            
        }
        pw.write("result:"+sum);
        pw.flush();
    }
}
