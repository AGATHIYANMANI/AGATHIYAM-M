import java.io.*;

public class findbig_ternery1 {
     public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int a=Integer.parseInt(br.readLine());
        int b=Integer.parseInt(br.readLine());
        int c=Integer.parseInt(br.readLine());
        String result=(a>b&&a>c)?a+" is big":(b>c&&b>a)?b+" is big":c+" is big";
        bw.write("Result : "+result);
        bw.flush();
    }
}
