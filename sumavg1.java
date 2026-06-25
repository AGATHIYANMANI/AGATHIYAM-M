
import java.io.*;
public class sumavg1 {
  void cal(int n,BufferedWriter bw,BufferedReader br) throws IOException{
    int total=0;
    for(int i=1;i<=n;i++){
         i=Integer.parseInt(br.readLine());
        total+=i;
    }
    int average=total/n;
   bw.write("Total:"+total);
   bw.flush();
  bw.write("Average:"+average);
  bw.flush();

  } 
  public static void main(String [] args) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    bw.write("Enter number of element:");
    bw.flush();
    int n=Integer.parseInt(br.readLine());
    sumavg1 sa=new sumavg1();
    sa.cal(n,bw,br);
  } 
}