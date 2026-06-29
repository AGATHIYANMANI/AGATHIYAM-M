
import java.io.*;

public class chartoint2{
    public static void main(String [] args) throws IOException{
       Console cs=System.console();
        char name=cs.readLine().charAt(0);
        int convert=(int)name;
        System.out.println("Integer of character "+name + " is "+ convert);
       


    }
}