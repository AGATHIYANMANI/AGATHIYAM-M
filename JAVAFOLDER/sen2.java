import java.io.*;

public class sen2 {
    public static void main(String[] args) throws IOException {
      Console cs=System.console();
       String s1=cs.readLine();
       String s2=cs.readLine();
       int count=0;
       for(int i=0;i<=s1.length()-1;i++){
           for(int j=0;j<=s2.length()-1;j++){
               if(s1.charAt(i)==s2.charAt(j)){
                   count++;
               }
           }
       }
       if(count>0){
           System.out.println("yes");
      
       }
       else{
          System.out.println("no");
    
       }
}
}
