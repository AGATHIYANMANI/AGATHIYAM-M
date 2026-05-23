import java.io.*;
public class cube2{
    public static void main (String[] args){
        int num;
        Console sn=System.console();
        sn.printf("Enter number:");
        num=Integer.parseInt(sn.readLine());
        int c=num*num*num;
        sn.printf("CUBE OF %d is %d",num,c);

    }
}