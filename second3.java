import java.io.*;

public class second3 {
     public static void main(String [] args){
       Console cs=System.console();
       PrintWriter pw=new PrintWriter(System.out);
        int num=Integer.parseInt(cs.readLine());
        int temp=num;
        
         int result=0;
        while(num>0){
            int last=num%10;
            num/=10;
            result=result*10+last;
        }
       int first=result%10;
         pw.write("First:"+first);
         pw.flush();
         pw.write("last:"+temp%10);
         pw.flush();
    }
}
