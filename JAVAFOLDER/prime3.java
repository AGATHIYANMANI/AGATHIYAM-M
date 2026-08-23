import java.io.*;

public class prime3 {
    void finals(int num){
        for(int i=2;i<num;i++){
        if(num%i==0){
            System.out.printf("%d is not prime number",num);
return;

        }
        
        
        }
        System.out.printf("%d is prime number",num);
    }
    public static void main(String [] args){
       Console cs=System.console();
        int num=Integer.parseInt(cs.readLine());
        prime2 pr=new prime2();
        pr.finals(num);
    }
}

