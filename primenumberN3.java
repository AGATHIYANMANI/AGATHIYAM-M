import java.io.*;


public class primenumberN3 {
       public class primenumberN1 {
public static void main(String[] args) throws IOException{
  Console cs=System.console();
  PrintWriter pw=new PrintWriter(System.out);
  int N=Integer.parseInt(cs.readLine());
  for(int i=2;i<N;i++){
    int count=0;
    for(int j=2;j<i;j++){
        if(i%j==0){
            count++;
        
            break;
        }
    }
    if(count==0){
   pw.write(i+" ");
    cs.flush();
}
}

    } 
} 
}
