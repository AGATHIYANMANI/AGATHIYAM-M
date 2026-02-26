import java.util.*;
public class factorial{
int cal(int num){

        if(num==0|| num==1){
            return 1;

        }
        else{
            return num*cal(num-1);
        }
    }

public static void main(String [] args){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
factorial ft=new factorial();
System.out.println("factorial of "+num+" is :"+ft.cal(num));
}
}