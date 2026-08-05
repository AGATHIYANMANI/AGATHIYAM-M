import java.io.*;

public class difference3 {
    
        public static void main(String[] args) throws IOException{
     Console cs=System.console();
  
     PrintWriter pw=new PrintWriter(System.out);
       int num1=Integer.parseInt(cs.readLine());
       int num2=Integer.parseInt(cs.readLine());
       if(num1>=num2){
         pw.write(num1-num2);
         pw.flush();
       }
          
       else if(num2>=num1){
          pw.write(num2-num1);
          pw.flush();
         
       }
}
        }
    
