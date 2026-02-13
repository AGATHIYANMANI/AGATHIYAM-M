import java.util.*;
public class counts {
    void exp(int num){
int result=0;
        while(num>0){
int a=num%10;//129.>>9
num=num/10;
result=result+a;

        }
        System.out.println("count total:"+result);
    }
    public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
counts co=new counts();
co.exp(num);

    }
}
