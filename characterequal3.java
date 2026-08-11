import java.io.*;

public class characterequal3 {
    Console cs=System.console();
    PrintWriter pw=new PrintWriter(System.out);
       String S=cs.readLine();
       char K=cs.readLine().charAt(0);
       int count=0;
       for(int i=0;i<S.length();i++){
           if(S.charAt(i)==K){
               count++;
           }
       }
       if(count>0){
           pw.write(count);
           pw.flush();
       }
       else{
           pw.write("-1");
           pw.flush();
       }
}
