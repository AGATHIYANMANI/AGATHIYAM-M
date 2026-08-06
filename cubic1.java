import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class cubic1 {
       public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int L=Integer.parseInt(br.readLine());
        int B=Integer.parseInt(br.readLine());
        int H=Integer.parseInt(br.readLine());
        int total=2*((L*B)+(L*H)+(B*H));
       bw.write(total+" ");
       bw.flush();
        bw.write(L*B*H);
        bw.flush();
        
    }
}
