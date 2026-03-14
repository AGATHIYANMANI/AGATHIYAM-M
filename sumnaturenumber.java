import java.util.*;
public class sumnaturenumber {
    void cal(int num){
       int sum=0;
        for(int i=1;i<=num;i++){

       sum+=i;
        }
        System.out.println(sum);

    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sumnaturenumber ss=new sumnaturenumber();
        ss.cal(num);
    }
}
