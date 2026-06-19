
import java.io.*;
public class fibonnaci1 {
    int cal(int num){
        if(num==0){
            return 0;
        }
        else if(num==1){
            return 1;
        }
        else{
            return cal(num-1)+cal(num-2);
        }

    }
    public static void main(String [] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int num=Integer.parseInt(br.readLine());
        fibonnaci1 fi=new fibonnaci1();
        bw.write("fibonnaci of "+num+ " is:"+fi.cal(num));
        bw.flush();

    }
}
