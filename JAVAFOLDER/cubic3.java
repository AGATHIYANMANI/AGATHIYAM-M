import java.io.*;

public class cubic3 {
        public static void main(String[] args)throws IOException{
        Console cs=System.console();
        PrintWriter pw=new PrintWriter(System.out);
        int L=Integer.parseInt(cs.readLine());
        int B=Integer.parseInt(cs.readLine());
        int H=Integer.parseInt(cs.readLine());
        int total=2*((L*B)+(L*H)+(B*H));
      pw.write(total+" ");
       pw.flush();
       pw.write(L*B*H);
       pw.flush();
     
        
    }
}
