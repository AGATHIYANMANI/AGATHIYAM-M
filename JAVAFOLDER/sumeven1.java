import java.io.*;

public class sumeven1 {
      public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int num1=Integer.parseInt(br.readLine());
        int num2=Integer.parseInt(br.readLine());
        int total=num1+num2;
        String result=(total%2==0)?"even":"odd";
        bw.write(result);
        bw.flush();
    }
}
