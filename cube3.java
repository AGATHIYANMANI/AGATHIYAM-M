import java.io.*;
public class cube3 {
void find(int n,BufferedWriter bw) throws IOException{
     int c=n*n*n;
     bw.write("CUBE :"+ c);
     bw.flush();    
}
public static void main(String[] args) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw=new BufferedWriter (new OutputStreamWriter(System.out));
    bw.write("Enter number:");
    bw.flush();
    int n=Integer.parseInt(br.readLine());
    
    cube3 ss=new cube3();
    ss.find(n,bw);
    

}}