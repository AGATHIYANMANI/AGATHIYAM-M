import java.io.*;

public class nextsquarw1 {
     public static void main(String [] args) throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int num=Integer.parseInt(br.readLine());

        int result=num*2;
        bw.write(result); 
        bw.flush();
    }
}
