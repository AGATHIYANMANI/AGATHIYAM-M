import java.io.*;


public class factorialloop2 {
     public static void main(String [] args) throws IOException{
      Console cs=System.console();
      int num=Integer.parseInt(cs.readLine());
        int con=1;
      for(int i=1;i<=num;i++){
        con*=i;
      }

     System.out.println(String.valueOf(con));
     

    } 
}
