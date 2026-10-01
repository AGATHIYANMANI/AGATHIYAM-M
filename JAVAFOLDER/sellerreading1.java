
import java.io.*;
public class sellerreading1{
    public static void main(String[] args) throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int count=0;
        String s=br.readLine();
        String s2=br.readLine();
        for(int i=0;i<s.length()-1;i++){
            for(int j=0;j<s2.length()-1;j++){
                if(s.charAt(i)==s2.charAt(j)){
                    count++;
                    break;
                }
            }
        }
        if(count==s.length()-1){
            bw.write("YES");
            bw.flush();
         }else{
             bw.write("NO");
             bw.flush(); }
    }
}