import java.io.Console;

public class bigtosmall3 {
    
    public static void main(String [] args){
    Console cs=System.console();
    char character =cs.readLine().charAt(0);
    int number=((int)character+32);
    char result=(char)number;

System.out.printf("The small of %c is %c ",character,result);
    }
}
