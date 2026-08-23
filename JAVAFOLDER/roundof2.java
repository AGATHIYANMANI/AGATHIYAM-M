import java.io.*;
public class roundof2{
public static void main(String[] args){
    Console cs=System.console();
float num=Float.parseFloat(cs.readLine());
int num1=(int)num;
if(num1<num){
num1++;
}
System.out.println(num1);

}
}
