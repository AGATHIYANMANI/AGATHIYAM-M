import java.io.*;

public class sen1 {
     public static void main(String[] args) throws IOException {
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
       String s1=br.readLine();
       String s2=br.readLine();
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
