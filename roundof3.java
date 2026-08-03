import java.io.*;
public class roundof3{
public static void main(String[] args){
    Console cs=System.console();
    PrintWriter pw=new PrintWriter(System.out);
float num=Float.parseFloat(cs.readLine());
int num1=(int)num;
if(num1<num){
num1++;
}
pw.write(num1);
pw.flush();


}
}
