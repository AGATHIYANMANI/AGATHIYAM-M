import java.io.*;
public class duck1{
    void cal(String sen,int n,BufferedWriter bw) throws IOException{
        for(int i=0;i<n;i++){
        if(sen.charAt(0)=='0'){
            bw.write("It is not duck number");
            bw.flush();
            return;
        }
        else{
            bw.write("It is duck number");
            bw.flush();
            return;
        }
        }
    }
    public static void main(String [] args) throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        
        String sen=br.readLine();
        int n=sen.length();

         duck1 dk=new duck1();
        dk.cal(sen,n,bw);
    }
}