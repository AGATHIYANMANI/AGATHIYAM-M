import java.io.*;
public class neon3{
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
            System.out.printf(" %d is neon number",num);
        }
        else{
            System.out.printf("%d is not neon number",num);
        }
        
    }
    public static void main(String [] args) throws IOException{
        Console br=System.console();
        System.out.printf("Enter number:");
    
        int num=Integer.parseInt(br.readLine());
        neon3 n3=new neon3();
        n3.cal(num);
    }
}