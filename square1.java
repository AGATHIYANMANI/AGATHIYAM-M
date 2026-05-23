import java.io.*;
public class square1 {
void find(int n,BufferedWriter bw) throws IOException{
     int c=n*n;
     bw.write("SQUARE :"+ c);
     bw.flush();    
}
public static void main(String[] args) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw=new BufferedWriter (new OutputStreamWriter(System.out));
    bw.write("Enter number:");
    bw.flush();
    int n=Integer.parseInt(br.readLine());
    
    square1 ss=new square1();
    ss.find(n,bw);
    

}}

    

