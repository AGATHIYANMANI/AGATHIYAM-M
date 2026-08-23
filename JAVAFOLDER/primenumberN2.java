import java.io.*;

public class primenumberN2 {
    public class primenumberN1 {
public static void main(String[] args) throws IOException{
  Console cs=System.console();
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
   System.out.println(i+" ");
    cs.flush();
}
}

    } 
}
}
