import java.io.*;

public class delete2 {
     public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        String sentence=br.readLine();
        StringBuilder sb=new StringBuilder(sentence);
        sb.delete(2,3);
       bw.write(sb.toString());
       bw.flush();
    } 
}
