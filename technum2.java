import java.io.*;
public class technum2 {
    void find(int n){
        int temp=n;
        int num=n%100;
        int num1=n/100;
        int sum=num+num1;
        int cal=sum*sum;
        if(cal==temp){
            System.out.println("IT IS TECH NUMBER");
        }
        else{
            System.out.println("IT IS NOT TECH NUMBER");
    
        }


    }
    public static void main(String [] args) throws IOException{
        Console cs=System.console();
        System.out.println("Enter number:");
        cs.flush();
        int n=Integer.parseInt(cs.readLine());
        technum2 tc=new technum2();
        tc.find(n);
    }
}
