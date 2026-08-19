import java.io.*;

public class find3 {
    public static void main(String[] args)throws IOException{
        Console cs=System.console();
        PrintWriter pw=new PrintWriter(System.out);
        int N=Integer.parseInt(cs.readLine());
        int K=Integer.parseInt(cs.readLine());
        int[] arr=new int[N];
        for(int i=0;i<=N-1;i++){
            arr[i]=Integer.parseInt(cs.readLine());
        }
        int count=0;
        for(int j=0;j<=N-1;j++){
            if(arr[j]==K){
              pw.write(j+1);
              pw.flush();
                count++;
                return;
            }
           
            
        }
        if(count==0){
            pw.write("-1");
            pw.flush();
        }
    }
}
