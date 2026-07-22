import java.io.Console;

public class countrepetation2 {
    public static void main(String [] args){
    Console cs=System.console();
    String sentence=cs.readLine();//school
    for(int i=0;i<sentence.length();i++){
        int count=0;
        for(int j=0;j<sentence.length();j++){
        if(sentence.charAt(i)==sentence.charAt(j)){
            count++;
        }
        
    }
    System.out.println(sentence.charAt(i) +"= "+count);
}
    }
}
