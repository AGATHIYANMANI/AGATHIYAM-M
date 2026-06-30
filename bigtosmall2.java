import java.io.*;

public class bigtosmall2 {
    
    public static void main(String [] args){
    Console cs=System.console();
    char character =cs.readLine().charAt(0);
    int number=((int)character+32);
    char result=(char)number;

System.out.println("The small of "+character+" is "+result);
    }
}
