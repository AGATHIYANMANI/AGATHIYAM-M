import java.io.*;
class output1{
    public static void main(String [] args) throws IOException{
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("HIIII gh");
        bw.flush();
    }
}