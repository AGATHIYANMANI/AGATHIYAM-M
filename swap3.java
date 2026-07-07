import java.io.*;


public class swap3 {
    public static void main(String [] args) throws IOException{
Console cs=System.console();

int num1=Integer.parseInt(cs.readLine());
int num2=Integer.parseInt(cs.readLine());
int temp=num1;
num1=num2;
num2=temp;
System.out.printf("num1 : %d",num1);
System.out.printf("num2 : %d",num2);
    } 
}
