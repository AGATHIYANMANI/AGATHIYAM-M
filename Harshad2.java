import java.io.*;
public class Harshad2 {
    void find(int num){
       
        int total=0;
        while(num>0){
            int a=num%10;
              total+=a;
              num/=10;
        }
        if(num%total==0){
            System.out.println("Harshad number");
        }
        else{
            System.out.println("not harshad number");
        }
    }
    public static void main(String [] args){
Console cs=System.console();

int num=Integer.parseInt(cs.readLine());
Harshad2 hr=new Harshad2();
hr.find(num);
    }
    
}
