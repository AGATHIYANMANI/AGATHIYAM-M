import java.io.*;

public class characterequal2 {
    Console cs=System.console();
       String S=cs.readLine();
       char K=cs.readLine().charAt(0);
       int count=0;
       for(int i=0;i<S.length();i++){
           if(S.charAt(i)==K){
               count++;
           }
       }
       if(count>0){
           System.out.println(count);
       }
       else{
           System.out.println("-1");
       }
    }

