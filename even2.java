import java.io.*;
public class even2 {
    public static void main(String [] args){
        Console cs=System.console();
        int num=Integer.parseInt(cs.readLine());
        if (num%2==0){
            System.out.println("EVEN");

        }
        else{
            System.out.println("ODD");
        }
    }
    
}
