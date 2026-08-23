
import java.io.*;
public class roundof1{
public static void main(String[] args) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
float num=Float.parseFloat(br.readLine());
int num1=(int)num;
if(num1<num){
num1++;
}
bw.write(num1);
bw.flush();


}
}
