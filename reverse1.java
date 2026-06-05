import java.io.*;
public class reverse1{
public static void main(String [] args) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    bw.write("Enter number:");
    bw.flush();
    int num=Integer.parseInt(br.readLine());
    int las=0;
    while(num>0){
        int a=num%10;
        las=(las*10)+a;
        num/=10;

    }
    bw.write("The reversed num is:"+las);
    bw.flush();
}
}