import java.io.*;

public class squardigit1 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int num=Integer.parseInt(br.readLine());
        int sum=0;
        while(num>0){
            int last=num%10;
            num/=10;
            int mul=last*last;
            sum+=mul;
            
        }
        bw.write("Result: "+sum);
        bw.flush();
    }
}
