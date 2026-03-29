import java.util.*;
public class ISBN{
    void cal(long num){
        int sum=0;
        long temp=0;
        long org=num;
        while(num>0){
            for (int i=1;i<11;i++){
                 temp=num%10;
                sum+=i*temp;
                num/=10;
            }
        }
        if(sum%11==0){
        System.out.println(org+"is ISBN number");
        }
        else{
            System.out.println(org+"is not ISBN number");
        }

    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        long num=sc.nextLong();
        ISBN isbn=new ISBN();
        isbn.cal(num);




    }
}