import java.io .*;

public class chartoint1 {
    void cal(char a,BufferedWriter bw) throws IOException{
       bw.write("character:"+a);
       bw.flush();
        int b=a;
       bw.write("integer:"+b);
       bw.flush();
    }
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        char a=br.readLine().charAt(0);
        chartoint1 cc=new chartoint1();
        cc.cal(a,bw);

    }
}
