
import java.io.*;
public class fibonnaci2 {
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
        Console cs=System.console();

        int num=Integer.parseInt(cs.readLine());
        fibonnaci2 fi=new fibonnaci2();
        System.out.println("fibonnaci of "+num+ " is:"+fi.cal(num));
       

    }
}
