import java.io.*;
public class leave2 {
    
public static void main(String[] args) {
       Console cs=System.console();
       String s=cs.readLine();
      
       if(s=="saturday"|| s=="sunday"){
           System.out.println("yes");
           
       }
       
       else{
           System.out.println("no");
       }
    }
}