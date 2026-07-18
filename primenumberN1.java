import java.io.*;

public class primenumberN1 {
public static void main(String[] args) throws IOException{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));          
  int N=Integer.parseInt(br.readLine());
  for(int i=2;i<N;i++){
    int count=0;
    for(int j=2;j<i;j++){
        if(i%j==0){
            count++;
        
            break;
        }
    }
    if(count==0){
    bw.write(i+" ");
    bw.flush();
}
}

    } 
}
