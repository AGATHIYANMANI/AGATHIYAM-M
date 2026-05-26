import java.io.*;
public class technum3 {
    void find(int n){
        int temp=n;
        int num=n%100;
        int num1=n/100;
        int sum=num+num1;
        int cal=sum*sum;
        if(cal==temp){
            System.out.printf("%d is IT IS TECH NUMBER",temp);
        }
        else{
            System.out.printf("%d is IT IS NOT TECH NUMBER",temp);
    
        }


    }
    public static void main(String [] args) throws IOException{
        Console cs=System.console();
        System.out.println("Enter number:");
        cs.flush();
        int n=Integer.parseInt(cs.readLine());
        technum3 tc=new technum3();
        tc.find(n);
    }
}
