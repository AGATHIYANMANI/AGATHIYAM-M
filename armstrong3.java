import java.io.*;
public class armstrong3 {
    void cal(int num)throws IOException{
        int temp=num;
        int sum=0;
        int digit=String.valueOf(num).length();
        while(num>0){
            int a=num%10;
            num/=10;
             sum+=Math.pow(a,digit);
        }
        if(sum==temp){
            System.out.printf(" %d is armstrong number",num);
        }
        else{
            System.out.printf("%d is not armstron number",num);
        }
        
    }
    public static void main(String [] args) throws IOException{
        Console cc=System.console();
        System.out.println("Enter number:");
        int num=Integer.parseInt(cc.readLine());
        armstrong2 ar=new armstrong2();
        ar.cal(num);
    }
}

