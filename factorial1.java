import java.io.*;
public class factorial1{
int cal(int num){

        if(num==0|| num==1){
            return 1;

        }
        else{
            return num*cal(num-1);
        }
    }

public static void main(String [] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

int num=Integer.parseInt(br.readLine());
factorial1 ft=new factorial1();
System.out.println("factorial of "+num+" is :"+ft.cal(num));
}
}