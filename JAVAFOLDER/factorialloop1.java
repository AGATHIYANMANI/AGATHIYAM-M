import java.io.*;

public class factorialloop1 {
       public static void main(String [] args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      int num=Integer.parseInt(br.readLine());
        int con=1;
      for(int i=1;i<=num;i++){
        con*=i;
      }
     bw.write(String.valueOf(con));
     bw.flush();

    } 
}
