import java.io.*;
import java.util.Scanner;

public class check2 {
        public static void main(String[] args) throws IOException{
      Console cs=System.console();
       int N=Integer.parseInt(cs.readLine());
       int K=Integer.parseInt(cs.readLine());
       int[] array=new int[N];
       for(int i=0;i<N;i++){
           array[i]=Integer.parseInt(cs.readLine());
           if(array[i]==K){
               System.out.println("yes");
               return;
           }
           
       }
       System.out.println("no");
    }
}
