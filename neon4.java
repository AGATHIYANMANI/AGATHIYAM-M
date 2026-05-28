import java.io.*;
public class neon4{
    void cal(int num,PrintWriter pw) throws IOException{
        int sq=num*num;
        int temp=num;
        int sum=0;
        while(sq>0){
            int a=sq%10;
            sq/=10;
            sum+=a;
        }
        if(sum==temp){
            pw.println(num+"is neon number");
        }
        else{
            pw.println(num+"is not neon number");
        }
        pw.flush();
        
    }
    public static void main(String [] args) throws IOException{
        Console cs=System.console();
        PrintWriter pw=new PrintWriter(System.out);
        pw.printf("Enter number:");
        pw.flush();

        int num=Integer.parseInt(cs.readLine());
        neon4 n4=new neon4();
        n4.cal(num,pw);
    }
}