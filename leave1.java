import java.io.*;

public class leave1 {
     public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
       String s=br.readLine();
      
       if(s=="saturday"|| s=="sunday"){
           bw.write("yes");
           bw.flush();
           
       }
       
       else{
           bw.write("no");
           bw.flush();
       }
    }
}
