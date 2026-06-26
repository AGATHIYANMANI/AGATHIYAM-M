import java.util.*;
public class krishnamurthy{
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
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sec=num;
        krishnamurthy kr=new krishnamurthy();
        int result=kr.cal(num);
        if(result==sec){
            System.out.println("It is krishnamurthy number");
        }
        else{
            System.out.println("It is not krishnamurthy number");
        }
    }
}
