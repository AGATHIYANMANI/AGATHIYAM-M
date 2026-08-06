import java.io.*;

public class cubic2 {
      public static void main(String[] args)throws IOException{
        Console cs=System.console();
        int L=Integer.parseInt(cs.readLine());
        int B=Integer.parseInt(cs.readLine());
        int H=Integer.parseInt(cs.readLine());
        int total=2*((L*B)+(L*H)+(B*H));
       System.out.print(total+" ");
       
        System.out.print(L*B*H);
     
        
    }
}
