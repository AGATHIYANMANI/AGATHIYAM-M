import java.io.*;

public class binary1 {
    void cal(int num,BufferedWriter bw) throws IOException{
        bw.write("number:"+num);
       
    String a=Integer.toBinaryString(num);
     bw.write(a);
     bw.flush();
    }

    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        
        int num=Integer.parseInt(br.readLine());
        binary1 bi=new binary1();
        bi.cal(num,bw);
    }
}
