import java.io.*;

public class find1 {
     public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int N=Integer.parseInt(br.readLine());
        int K=Integer.parseInt(br.readLine());
        int[] arr=new int[N];
        for(int i=0;i<=N-1;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        int count=0;
        for(int j=0;j<=N-1;j++){
            if(arr[j]==K){
                bw.write(j+1);
                bw.flush();
                count++;
                return;
            }
           
            
        }
        if(count==0){
            bw.write("-1");
            bw.flush();
        }
    }
}
