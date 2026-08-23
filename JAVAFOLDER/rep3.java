import java.io.*;


public class rep3 {
   public static void main(String[] args) {
       Console cs=System.console();
       PrintWriter pw=new PrintWriter(System.out);
       String S1=cs.readLine();
       int n=S1.length();
       String S2=cs.readLine();
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
              pw.write(S1.charAt(i));
              pw.flush();
               total++;
           }
           }
           if(total==0){
               pw.write("-1");
               pw.flush();
               return;
       }
    }  
}
