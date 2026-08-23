import java.io.*;
public class swap2 {
    public static void main(String [] args) throws IOException{
Console cs=System.console();

int num1=Integer.parseInt(cs.readLine());
int num2=Integer.parseInt(cs.readLine());
int temp=num1;
num1=num2;
num2=temp;
System.out.println("num1"+num1);
System.out.println("num2"+num2);
    } 
}
