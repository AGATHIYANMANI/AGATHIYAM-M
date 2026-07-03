import java.io.Console;
import java.io.IOException;

public class factorialloop3 {
     public static void main(String [] args) throws IOException{
      Console cs=System.console();
      int num=Integer.parseInt(cs.readLine());
        int con=1;
      for(int i=1;i<=num;i++){
        con*=i;
      }

     System.out.printf(String.valueOf(con));
     

    } 
}
