import java.io.*;
public class Harshad3 {
    void find(int num){
       int temp=num;
        int total=0;
        while(num>0){
            int a=num%10;
              total+=a;
              num/=10;
        }
        if(num%total==0){
            System.out.printf("%d is Harshad number",temp);
        }
        else{
            System.out.printf("%d is not harshad number",temp);
        }
    }
    public static void main(String [] args){
Console cs=System.console();

int num=Integer.parseInt(cs.readLine());
Harshad3 hr=new Harshad3();
hr.find(num);
    }
    
}
