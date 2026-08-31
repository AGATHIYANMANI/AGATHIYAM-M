import java.io.*;

public class conversion3 {
    public static void main(String[] args) {
       Console cs=System.console();
       PrintWriter pw=new PrintWriter(System.out);
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
    pw.write(ff);
    pw.flush();
} 
}
