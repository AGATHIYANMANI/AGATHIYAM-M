import java.io.*;

public class rep1 {
   public static void main(String[] args) throws IOException{
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
       String S1=br.readLine();
       int n=S1.length();
       String S2=br.readLine();
       int p=S2.length();
       int total=0;
       for(int i=0;i<n;i++){
           int count=0;
           for(int j=0;j<p;j++){
               if(S1.charAt(i)==S2.charAt(j)){
                  count++;
                  break;
               }
           }
           if(count==0){
               bw.write(S1.charAt(i));
               bw.flush();
               total++;
           }
           }
           if(total==0){
               bw.write("-1");
               bw.flush();
               return;
       }
    } 
}
