import java.io.*;

public class stringreverse1 {
       public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        String sentence=br.readLine();
        StringBuilder sb = new StringBuilder(sentence);
        bw.write(sb.reverse().toString());
        bw.flush();
        
    }
}
