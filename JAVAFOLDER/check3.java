import java.io.*;

public class check3 {
 
        public static void main(String[] args) throws IOException{
      Console cs=System.console();
      PrintWriter pw=new PrintWriter(System.out);
       int N=Integer.parseInt(cs.readLine());
       int K=Integer.parseInt(cs.readLine());
       int[] array=new int[N];
       for(int i=0;i<N;i++){
           array[i]=Integer.parseInt(cs.readLine());
           if(array[i]==K){
               pw.write("yes");
               pw.flush();
               return;
           }
           
       }
       pw.write("no");
       pw.flush();
    } 
}
