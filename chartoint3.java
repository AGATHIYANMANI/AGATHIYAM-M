
import java.io.*;

public class chartoint3{
    public static void main(String [] args) throws IOException{
       Console cs=System.console();
        char name=cs.readLine().charAt(0);
        int convert=(int)name;
        System.out.printf("Integer of character %c is %d",name,convert);
       


    }
}