import java.io.*;

public class characterequal1 {
    public static void main(String[] args)throws IOException {
       BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       String S=br.readLine();
       char K=br.readLine().charAt(0);
       int count=0;
       for(int i=0;i<S.length();i++){
           if(S.charAt(i)==K){
               count++;
           }
       }
       if(count>0){
           bw.write(count);
           bw.flush();
       }
       else{
           bw.write("-1");
           bw.flush();
       }
    }
}
