import java.io.*;
public class largenum3 {
    public static void main(String [] args){
        Console cn=System.console();
        cn.printf("Enter number1:");
        int n1=Integer.parseInt(cn.readLine());
        cn.printf("Enter number 2:");
        int n2=Integer.parseInt(cn.readLine());
        int c=n1+n2;
        cn.printf("add:"+c);
    
    }
    
}
