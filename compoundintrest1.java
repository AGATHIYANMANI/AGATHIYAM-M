
import java.io.*;
public class compoundintrest1 {
    void cal(int P,int R,int y,BufferedWriter bw) throws IOException{
        double cc=(P* Math.pow(1+(R/100),y))-P;
        bw.write("Compound intrest:"+cc);
    }
    
public static void main(String [] args) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
    bw.write("Enter principle ammount:");
    bw.flush();
    int P=Integer.parseInt(br.readLine());
     bw.write("Enter Annual intrest:");
     bw.flush();
    int R=Integer.parseInt(br.readLine());
    bw.write("Enter year:");
    bw.flush();
    int y=Integer.parseInt(br.readLine());
    compoundintrest1 cp=new compoundintrest1();
    cp.cal(P,R,y,bw);
}    
}
