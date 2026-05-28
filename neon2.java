import java.io.*;
public class neon2{
    void cal(int num) throws IOException{
        int sq=num*num;
        int temp=num;
        int sum=0;
        while(sq>0){
            int a=sq%10;
            sq/=10;
            sum+=a;
        }
        if(sum==temp){
            System.out.println(temp+" is neon number");
        }
        else{
            System.out.println(temp+"is not neon number");
        }
        
    }
    public static void main(String [] args) throws IOException{
        Console br=System.console();
        System.out.println("Enter number:");
    
        int num=Integer.parseInt(br.readLine());
        neon2 n2=new neon2();
        n2.cal(num);
    }
}