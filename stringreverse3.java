import java.io.*;


public class stringreverse3 {
    
    public static void main(String [] args) throws IOException{
        Console cs=System.console();
        String sentence=cs.readLine();
        PrintWriter pw=new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder(sentence);
      pw.write(sb.reverse().toString());
       
        
    }
}
