import java.io.*;

public class prime2 {
    void finals(int num){
        for(int i=2;i<num;i++){
        if(num%i==0){
            System.out.println("not prime number");
return;

        }
        
        
        }
        System.out.println("prime number");
    }
    public static void main(String [] args){
       Console cs=System.console();
        int num=Integer.parseInt(cs.readLine());
        prime2 pr=new prime2();
        pr.finals(num);
    }
}
