import java.util.*;
public class sswitch{
    void cal(char op,int num1,int num2){
        switch(op){
        case '+':
        System.out.println(num1+num2);
        break;
        case '-':
        System.out.println(num1-num2);
        break;
        default:
        System.out.println("enter correct operators");
        }
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        char op=sc.next().charAt(0);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        sswitch sw=new sswitch();
        sw.cal(op,num1,num2);
    }
}