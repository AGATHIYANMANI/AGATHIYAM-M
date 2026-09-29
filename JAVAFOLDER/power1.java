
    import java.io.*;
public class power1{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        double x=Double.parseDouble(br.readLine());
        int n=Integer.parseInt(br.readLine());
        double result=Math.pow(x,n);
        bw.write("POWERED:"+result);
        bw.flush();
    }
}

