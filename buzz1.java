import java.io.*;
public class buzz1{
    void cal(int n,BufferedWriter bw) throws IOException{
            if(n%7==0 || n%10==7){
                bw.write("IT IS BUZZ NUMBER");
            }
            else{
                bw.write("IT IS NOT BUZZ NUMBER");
            }
            bw.flush();

    }
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("Enter number:");
        bw.flush();
        int n=Integer.parseInt(br.readLine());
        buzz1 b=new buzz1();
        b.cal(n,bw);
    }
}