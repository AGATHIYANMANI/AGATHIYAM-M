import java.io.*;

public class equals1 {
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        String s1=br.readLine();
        String s2=br.readLine();
        if(s1.equals(s2)){
            bw.write("yes");
            bw.flush();
        }
        else{
            bw.write("no");
            bw.flush();
        }
    }
}
