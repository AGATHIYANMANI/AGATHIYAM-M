import java.io.*;

public class equal2 {
     public static void main(String[] args) {
       Console cs=System.console();
       String s1=cs.readLine();
       String s2=cs.readLine();
       int num=Integer.parseInt(cs.readLine());
       char first=s1.charAt(num);
       char second=s2.charAt(num);
       if(first==second){
          System.out.println("yes");
       }else{
            System.out.println("no");
       }
    }
}
