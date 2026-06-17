import java.io.*;
public class factorial3{
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
factorial3 ft=new factorial3();
int re=ft.cal(num);
System.out.printf("factorial of %d is :%d",num,re);
}
}