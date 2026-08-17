import java.io.*;

public class second1 {
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int num=Integer.parseInt(br.readLine());
        int temp=num;
        
         int result=0;
        while(num>0){
            int last=num%10;
            num/=10;
            result=result*10+last;
        }
       int first=result%10;
          bw.write("First:"+first);
          bw.flush();
          bw.write("last:"+temp%10);
          bw.flush();
    }
}
