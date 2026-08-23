import java.io.*;

public class difference2 {
        public static void main(String[] args) throws IOException{
     Console cs=System.console();
       int num1=Integer.parseInt(cs.readLine());
       int num2=Integer.parseInt(cs.readLine());
       if(num1>=num2){
         System.out.println(num1-num2);
          cs.flush();
       }
       else if(num2>=num1){
          System.out.println(num2-num1);
          cs.flush();
       }
       
    }
}
