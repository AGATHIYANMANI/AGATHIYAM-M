import java.io.*;
public class krishnamurthy3{
    int factorial(int num){
        if(num==0||num==1){
            return 1;
        }
        else{
            return num*factorial(num-1);
        }
    }
    int cal(int num){
    int org=num;
    int sum=0;
    while(org>0){
        int temp=org%10;//123..3
        sum+=factorial(temp);
        org/=10;//..12
    
        }
        return sum;
    }
    
    public static void main(String [] args){
        Console cs=System.console();
        int num=Integer.parseInt(cs.readLine());
        int sec=num;
        krishnamurthy3 kr=new krishnamurthy3();
        int result=kr.cal(num);
        if(result==sec){
            System.out.printf("%d is krishnamurthy number",num);
        }
        else{
            System.out.printf("%d is not krishnamurthy number",num);
        }
        
    }
}