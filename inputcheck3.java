import java.io.*;

public class inputcheck3 {
     public static void main(String[] args) throws IOException{
      Console cs=System.console();
      PrintWriter pw=new PrintWriter(System.out);
      String sentence=cs.readLine();
      boolean target=true;
      for(int i=0;i<sentence.length();i++){
          char character=sentence.charAt(i);
          if(character <'0' || character >'9'){
              target=false;
              break;
          }
      }
      if(target){
          pw.write("yes");
          pw.flush();
      }
      else{
          pw.write("no");
          pw.flush();
      }
    }
}
