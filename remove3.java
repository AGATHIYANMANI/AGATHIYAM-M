import java.io.*;

public class remove3 {
    public static void main(String [] args){
        Console cs=System.console();
        PrintWriter Pw=new PrintWriter(System.out);
    
     String sentence=cs.readLine();
     String removed=sentence.replace(" ","");
     Pw.write("Given Sentence: "+sentence);
     Pw.flush();
     Pw.write("Removed Sentence: "+removed);
     Pw.flush();
    }
}
