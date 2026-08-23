import java.util.*;
public class roundof{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
float num=sc.nextFloat();
int num1=(int)num;
if(num1<num){
num1++;
}
System.out.println(num1);

}
}
