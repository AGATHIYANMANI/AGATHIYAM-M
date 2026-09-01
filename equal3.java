import java.io.*;

public class equal3 {
    public static void main(String[] args) {
       Console cs=System.console();
       PrintWriter pw=new PrintWriter(System.out);
       String s1=cs.readLine();
       String s2=cs.readLine();
       int num=Integer.parseInt(cs.readLine());
       char first=s1.charAt(num);
       char second=s2.charAt(num);
       if(first==second){
         pw.write("yes");
         pw.flush();
       }else{
            pw.write("no");
            pw.flush();
       }
    }
}
