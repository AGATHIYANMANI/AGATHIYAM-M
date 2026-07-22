import java.io.*;

public class countrepetation3 {
        public static void main(String [] args){
    Console cs=System.console();
    String sentence=cs.readLine();//school
    PrintWriter pw=new PrintWriter(System.out);
    for(int i=0;i<sentence.length();i++){
        int count=0;
        for(int j=0;j<sentence.length();j++){
        if(sentence.charAt(i)==sentence.charAt(j)){
            count++;
        }
        
    }
    pw.write("\n"+sentence.charAt(i) +"= "+count);
    pw.flush();
}
    }
}
