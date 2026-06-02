import java.io.*;
public class sumnat{
    public static void main(String [] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("ENTER NUMBER:");
        bw.flush();
        int num=Integer.parseInt(br.readLine());
        int sum=0;
        for(int i=0;i<=num;i++){
            sum+=i;
        }
        bw.write(sum);
        bw.flush();
    }
}