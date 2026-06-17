import java.io.*;
public class factorial2{
int cal(int num){

        if(num==0|| num==1){
            return 1;

        }
        else{
            return num*cal(num-1);
        }
    }

public static void main(String [] args) throws IOException{
Console cs=System.console();

int num=Integer.parseInt(cs.readLine());
factorial2 ft=new factorial2();
System.out.println("factorial of "+num+" is :"+ft.cal(num));
}
}