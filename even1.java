import java.io.*;
public class even1 {
    public static void main(String [] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
         BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    if(num%2==0){
       
        bw.write("EVEN NUMBER");
        bw.flush();
    }
    else{
            bw.write("ODD NUMBER");
            bw.flush();
        }
    
    }
}
