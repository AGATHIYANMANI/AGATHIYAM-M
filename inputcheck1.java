import java.io.*;

public class inputcheck1 {
     public static void main(String[] args) throws IOException{
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
      String sentence=br.readLine();
      boolean target=true;
      for(int i=0;i<sentence.length();i++){
          char character=sentence.charAt(i);
          if(character <'0' || character >'9'){
              target=false;
              break;
          }
      }
      if(target){
          bw.write("yes");
          bw.flush();
      }
      else{
          bw.write("no");
          bw.flush();
      }
    }
}
