import java.io.*;

public class conversion2 {
   public static void main(String[] args) {
       Console cs=System.console();
        String str=cs.readLine();
        int n=str.length()-1;
        String ff="";
        for(int i=0;i<=n;i++){
            char first=str.charAt(i);
            if(first>=65 && first<=90){
            int num=(int)first+32;
            char nn=(char)num;
            ff+=nn;
            
        }
        else if(first>=97 && first<=122){
            int num=(int)first-32;
             char nn=(char)num;
            ff+=nn;
        }
        
    }
    System.out.println(ff);
} 
}
