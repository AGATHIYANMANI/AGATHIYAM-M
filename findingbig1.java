import java.io.*;
public class findingbig1 {
    void cal(int a,int b,int c,BufferedWriter bw) throws IOException{
        if(a>=b&&a>=c){
            bw.write("A is BIG");
            bw.flush();
        }
        else if(b>=a&&b>=c){
            bw.write("B is BIG");
            bw.flush();
        }
        
        else{
           bw.write("C is BIG");
           bw.flush();
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        int c=Integer.parseInt(br.readLine());
        findingbig1 bg=new findingbig1();
        bg.cal(a,b,c,bw);
    }
}
