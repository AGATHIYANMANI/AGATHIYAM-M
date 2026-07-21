import java.io.Console;

public class delete3 {
      public static void main(String[] args){
       Console cs=System.console();
        String sentence=cs.readLine();
        StringBuilder sb=new StringBuilder(sentence);
        sb.delete(2,3);
        System.out.println(sb);
    }
}
