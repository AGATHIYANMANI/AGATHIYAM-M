import java.io.*;
public class reverse3{
public static void main(String [] args) throws IOException{
   Console cs=System.console();
    System.out.printf("Enter number:");

    int num=Integer.parseInt(cs.readLine());
    int las=0;
    while(num>0){
        int a=num%10;
        las=(las*10)+a;
        num/=10;

    }
   System.out.printf("The reversed num is:%d",las);
 
}
}