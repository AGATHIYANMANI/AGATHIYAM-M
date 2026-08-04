import java.io.*;

public class oddevenchar1 {
   
    public static void main(String[] args) throws IOException{
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      String s=br.readLine();
      String con="";
      String con1="";
      for(int i=0;i<=s.length()-1;i++){
          if(i%2==0){
              con+=s.charAt(i);
          }
          else if(i%2==1){
              con1+=s.charAt(i);
          }
      }
      bw.write(con+" ");
      bw.flush();
      bw.write(con1);
      bw.flush();
    } 
}
