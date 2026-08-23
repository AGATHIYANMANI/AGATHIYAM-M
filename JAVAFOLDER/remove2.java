import java.io.Console;

public class remove2 {
       public static void main(String [] args){
        Console cs=System.console();

     String sentence=cs.readLine();
     String removed=sentence.replace(" ","");
     System.out.println("Given Sentence: "+sentence);
     System.out.println("Removed Sentence: "+removed);
    }
}
