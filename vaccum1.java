import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class vaccum1 {
    void simple(int step,BufferedWriter bw) throws IOException{
        if(step==1){
            bw.write("will clean");
            bw.flush();
        }
        else {
            bw.write("already clean");
            bw.flush();
        }
    }
    public static void main (String [] args) throws IOException{
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int step=1;
        vaccum1 vc=new vaccum1();
        vc.simple(step,bw);
    }
}
