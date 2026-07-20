import java.io.*;

public class removed1  {
        public static void main(String [] args)throws IOException{
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
     String sentence=br.readLine();
     String removed=sentence.replace(" ","");
     bw.write("Given Sentence: "+sentence);
     bw.flush();
     bw.write("\nRemoved Sentence: "+removed);
     bw.flush();
    }
}
