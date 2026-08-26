import java.io.*;
public class check1 {
    public static void main(String[] args) throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
       int N=Integer.parseInt(br.readLine());
       int K=Integer.parseInt(br.readLine());
       int[] array=new int[N];
       for(int i=0;i<N;i++){
           array[i]=Integer.parseInt(br.readLine());
           if(array[i]==K){
               bw.write("yes");
               bw.flush();
               return;
           }
           
       }
       bw.write("no");
       bw.flush();
    }
}