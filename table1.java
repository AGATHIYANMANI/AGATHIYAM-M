import java.io.*;

public class table1{
    void cal(int n,BufferedWriter bw) throws IOException{
        for(int i=1;i<=10;i++){
            bw.write("\n"+n+"X"+i+"="+n*i);
            bw.flush();

        }

    }
    public static void main(String [] args) throws IOException{
     BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
     BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
     bw.write("Enter what table should create:");
     bw.flush();
     int n=Integer.parseInt(bf.readLine());
     table1 tb=new table1();
     tb.cal(n,bw);
}
}