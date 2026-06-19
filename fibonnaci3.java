
import java.io.*;
public class fibonnaci3 {
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
        fibonnaci3 fi=new fibonnaci3();
        System.out.printf("fibonnaci of "+num+ " is:"+fi.cal(num));
        

    }
}
