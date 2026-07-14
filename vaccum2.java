import java.io.*;
public class vaccum2 {
    void simple(int step,PrintWriter pw) throws IOException{
        if(step==1){
           pw.write("will clean");
           pw.flush();
        }
        else {
           pw.write("already clean");
           pw.flush();
        }
    }
    public static void main (String [] args) throws IOException{
        int step=1;
        PrintWriter pw=new PrintWriter(System.out);
        vaccum2 vc=new vaccum2();
        vc.simple(step,pw);
    }
}
