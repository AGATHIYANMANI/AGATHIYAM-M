import java.io.*;

public class find2 {
    public static void main(String[] args)throws IOException{
        Console cs=System.console();
        int N=Integer.parseInt(cs.readLine());
        int K=Integer.parseInt(cs.readLine());
        int[] arr=new int[N];
        for(int i=0;i<=N-1;i++){
            arr[i]=Integer.parseInt(cs.readLine());
        }
        int count=0;
        for(int j=0;j<=N-1;j++){
            if(arr[j]==K){
                System.out.println(j+1);
                count++;
                return;
            }
           
            
        }
        if(count==0){
            System.out.println("-1");
        }
    }
}
