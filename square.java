import java.io.*;
public class square{
    public static void main (String[] args){
        int num;
        Console sn=System.console();
        sn.printf("Enter number:");
        num=Integer.parseInt(sn.readLine());
        int c=num*num;
        sn.printf("SQUARE OF %d is %d",num,c);

    }
}