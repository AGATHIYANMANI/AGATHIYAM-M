   import java.io.*;
   public class difference1 {


    public static void main(String[] args) throws IOException{
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
       int num1=Integer.parseInt(br.readLine());
       int num2=Integer.parseInt(br.readLine());
       if(num1>=num2){
          bw.write(num1-num2);
          bw.flush();
       }
       else if(num2>=num1){
          bw.write(num2-num1);
          bw.flush();
       }
       
    }
} 

